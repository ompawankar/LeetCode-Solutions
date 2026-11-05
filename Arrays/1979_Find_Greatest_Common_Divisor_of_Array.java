import  java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        int x=nums[nums.length-1];
        int y=nums[0];
        for(int i=1;i<=y;i++){
          if(x%i==0 && y%i==0){
           ans=i;
           }
        }
        return ans;
    }
}
