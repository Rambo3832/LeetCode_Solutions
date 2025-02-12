class Solution {
    public int maxSubArray(int[] nums) {
        

        // best optimal approach using kadane's algorithm
       

        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++)
        {
            sum +=nums[i];

            max= Math.max(sum,max);

            if(sum<0)
            {
                sum=0;
            }
            
            
        }
        return max;
 
        


        //using brute force, N^2 time limit exceeded. 

/*
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            int sum=0;
            for (int j=i; j<nums.length; j++)
            {
                sum+=nums[j];
                max= Math.max(max, sum);
            }
        }
        return max;
        */

    }
}