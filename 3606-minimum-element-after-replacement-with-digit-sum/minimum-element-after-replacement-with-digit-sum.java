class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i <nums.length ; i++){
            int sum = 0 ;
            while(nums[i]>0){
                int num = nums[i]%10;
                nums[i]/=10;
                sum = sum + num;
            }
            min = Math.min(min,sum);
        }
        return min;
    }
}