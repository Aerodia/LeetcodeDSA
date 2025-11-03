class Solution {
    public int alternatingSum(int[] nums) {
        int evensum = 0 ;
        int oddsum = 0;
        for(int i = 0 ; i<nums.length ; i+=2){
            evensum = evensum + nums[i];
        }
        for(int i = 1 ; i<nums.length;i+=2){
            oddsum = oddsum+nums[i];
        }
        return (evensum-oddsum);
    }
}