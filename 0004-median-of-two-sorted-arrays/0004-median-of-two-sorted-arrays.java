class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        int[] merged = new int[n + m];
        for(int i=0; i<n; ++i){
            merged[i] = nums1[i];
        }
        for(int j = 0; j<m; ++j){
            merged[n + j] = nums2[j];
        }
        Arrays.sort(merged);
        // System.out.println(Arrays.toString(merged));
        int len = n + m;
        if(len % 2 == 0){
            return (merged[len / 2] + merged[len / 2 - 1]) / 2.0;
        }else{
            return merged[len / 2];
        }
    }
}