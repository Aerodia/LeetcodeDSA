class Solution {
    public int maximumCount(int[] nums) {
        int countofneg = 0 ;
        int countofpos = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]<0){
                countofneg++;
            }else if(nums[i]>0){
                countofpos++;
            }else{
                continue;
            }
        }
        return Math.max(countofpos,countofneg);
    }
}