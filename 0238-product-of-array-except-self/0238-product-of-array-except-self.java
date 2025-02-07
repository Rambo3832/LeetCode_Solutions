class Solution {
    public int[] productExceptSelf(int[] nums) {
        //2nd approch  
        //problem : it used 2 extra spaces for arrays
        int ans[]= new int[nums.length];
        int n= nums.length;
        int pre[] = new int[n];
        pre[0]=1;
        int suff[] = new int[n];
        suff[n-1]=1;
        for(int i=1; i<n; i++)
        {
            pre[i] =nums[i-1] * pre[i-1];
        }
        
        for(int i=n-2; i>=0; i--)
        {
            suff[i] = suff[i+1] * nums[i+1]; 
        }

        for(int i=0; i<n; i++)
        {
            ans[i]= pre[i]*suff[i];
        }
        return ans;

        // Time limit exceede
        /*
        int ans[]=  new int [nums.length];
        int n= nums.length;
            
        for(int i=0; i<n; i++ )
        {
            int pre=1;
            int post=1;
            for(int j=0; j<i; j++)
            {
                pre*=nums[j];
            }

             for(int j=i+1; j<n; j++)
            {
                post*=nums[j];
            }
            ans[i]= pre*post;
        }
        return ans;
        */       
    }
}