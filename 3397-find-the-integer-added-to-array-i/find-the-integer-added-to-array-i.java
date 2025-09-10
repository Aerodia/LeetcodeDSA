class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 =Integer.MAX_VALUE;
        int min2 =Integer.MAX_VALUE;
        int x = 0;
        for(int i = 0 ; i<nums1.length ; i++){
            int currentmin1 = nums1[i];
            int currentmin2 = nums2[i];
            min1 = Math.min(min1,currentmin1);
            min2 = Math.min(min2 ,currentmin2);
        }
        if(min1 == min2) return 0;
        else{
            x = min2-min1; 
        }
        return x;
    }
}