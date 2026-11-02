class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) {
            return nums;
        }
        int[] arr=new int[nums.length];
        int j=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                arr[j++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                arr[j++]=nums[i];
            }
        }
        return arr;
    }
}
