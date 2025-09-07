class Solution {
    public double minimumAverage(int[] nums) {
        int small = 0 ;
        int large = nums.length - 1;
        double min = Double.MAX_VALUE;
        Arrays.sort(nums);
        while(small<large){
            double current = (nums[small]+nums[large])/2.0;
            min = Math.min(current,min);
            small++;
            large--;
        }
        return min;
    }
}