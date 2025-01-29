class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        //1 pass approch

        HashMap <Integer,Integer> ht= new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            int diff= target-nums[i];
            if(ht.containsKey(diff)){
                return new int[]{i,ht.get(diff)};
            }
            else
            {
                ht.put(nums[i],i);
            }
            
        }
        return new int[]{};
    }
}