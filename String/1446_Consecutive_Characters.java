class Solution {
    public int maxPower(String s) {
         int max=0;
        int count=1;
        char ch=' ';
        for(int i=0;i<s.length();i++){
if(ch!=s.charAt(i)){
    count=0;
}
ch=s.charAt(i);
count++;
max=Math.max(max,count);
        }
        return max;
    }
}
