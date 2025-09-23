class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sumofdigit = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            sum = sum + nums[i];
            while(nums[i]>0){
                int n = nums[i] %10;
                sumofdigit = sumofdigit + n;
                nums[i]/=10;
            }
        }
        return Math.abs(sum - sumofdigit);
    }
}