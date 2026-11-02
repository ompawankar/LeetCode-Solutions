class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];

        for (int k = 0; k < nums.length; k++) {

            if (nums[k] % 2 == k % 2) {
                ans[k] = nums[k];
            } 
            else {
                for (int j = k + 1; j < nums.length; j++) {

                    if (nums[j] % 2 == k % 2) {
                        int temp = nums[k];
                        nums[k] = nums[j];
                        nums[j] = temp;

                        ans[k] = nums[k];
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
