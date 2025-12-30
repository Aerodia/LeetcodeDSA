class Solution {
    public void moveZeroes(int[] nums) {
        int reader = 0 ;
        int writer = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == 0) reader++;
            else if(nums[i]!=0){
                nums[writer] = nums[i];
                writer++;
            }
        }
        for(int i = writer;i<nums.length;i++){
            nums[writer] = 0;
            writer++;
        }
        System.out.println(Arrays.toString(nums));
    }
}