class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int x = 0;
        for(int i = 0 ; i<nums1.length ; i++){
            if(nums1[i] == nums2[i]) return 0;
            else{
                x = nums2[i] - nums1[i]; 
            }
        }
        return x;
    }
}