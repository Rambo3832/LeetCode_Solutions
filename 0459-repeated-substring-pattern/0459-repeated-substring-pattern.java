class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str= s+s;
        String temp= str.substring(1,str.length()-1);
        
        if(temp.contains(s))
        {
            return true;
        }
        else return false;
        
    }
}