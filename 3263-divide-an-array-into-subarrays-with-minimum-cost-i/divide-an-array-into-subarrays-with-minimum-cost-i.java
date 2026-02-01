class Solution {
    public int minimumCost(int[] nums) {
        int min = Integer.MAX_VALUE;
        int cost = 0;
        for(int i = 1 ; i <nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                cost = nums[0] + nums[i] + nums[j];

                min = Math.min(cost,min);
            }
        }
        return min;
    }
}