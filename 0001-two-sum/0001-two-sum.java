class Solution {
    public int[] twoSum(int[] nums, int target) {
       
       //2 pass approch

       /*
       int n = nums.length;

       HashMap <Integer,Integer> ht= new HashMap<>();
       for(int i=0; i<n; i++)
       {
        ht.put(nums[i],i);

       }

       for(int i=0; i<n; i++)
       {
        int diff= target- nums[i];
        
        if(ht.containsKey(diff) && ht.get(diff)!=i)
        {
            return new int[]{i, ht.get(diff)};
        }
       }
       return new int[]{};

   */
   

   //1 pass approch
   
     HashMap <Integer, Integer> ht = new HashMap<>();

    // int [] arr= new int[2];
    int n= nums.length;
    for(int i=0; i<n; i++)
    {
        int compliment = target-nums[i];

        if(ht.containsKey(compliment))
        {
            return new int[] {ht.get(compliment),i};
            // arr[0]=ht.get(compliment);
            // arr[1]= i;

        }

        ht.put(nums[i], i);
    }
    return new int[]{};
       
     


       
       //brute force O(n^2);
       /*
        int n = nums.length;
        int[] ans= new int[2];
        for(int i=0;i <n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;

        */
    }
}