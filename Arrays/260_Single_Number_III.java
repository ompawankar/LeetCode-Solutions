class Solution {
    public int[] singleNumber(int[] nums) {
        int[] arr=new int[2];
        int l=0;
        for(int i=0;i<nums.length;i++){
        int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i] && j!=i){
                  break;
                }
                else{
                    count++;
                }    
            } 
            
            if(count==nums.length){
             arr[l]=nums[i];
             l++;
            }     
        }
        return arr;
        }
    }
