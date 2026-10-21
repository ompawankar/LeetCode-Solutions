class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n = nums1.length + nums2.length;
        int count = 0;
        double med=0.0;
        int[] arr = new int[n];
        for (int i = 0; i <= nums1.length; i++) {

            if (i == nums1.length) {
                for (int j = i; j < n; j++) {
                    arr[j] = nums2[j - nums1.length];
                    if (j == n) {
                        count++;
                        break;
                    }
                }

            }
            if (i != nums1.length) {
                arr[i] = nums1[i];
            }
            if (count == 1) {
                break;
            }

        }
        Arrays.sort(arr);
        if(arr.length%2==0){
          med=(arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
        }
        else{
            med=arr[arr.length/2];        
             }
            return med;
    }
}
