class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0)
{
    return true;
}
       s = s.toLowerCase();
       s = s.replaceAll("[^a-z0-9]", "");
       int right=0;
       int left=s.length()-1;
       while(left>=right){
        if(s.charAt(right)!=s.charAt(left)){
            return false;
        }
        left--;
        right++;
    }
    return true;
}
}
