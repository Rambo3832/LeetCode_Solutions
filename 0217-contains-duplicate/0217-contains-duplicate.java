class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet <Integer> set = new HashSet<>(); //create a hashset and check if the number already exists in it
        for( int i=0; i< nums.length; i++)
        {
           if(set.contains(nums[i]))
           return true;
            set.add(nums[i]);
        }
        return false;
    }
}