class Solution {
    public int minPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int left = 0 ;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left] + nums[right];
            max = Math.max(sum,max);
            left++;
            right--;
        }
        return max;
    }
}