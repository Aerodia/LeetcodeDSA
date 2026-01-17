class Solution {
    public void sortColors(int[] nums) {
        int left = 0 ;
        int right = nums.length - 1;
        int mid = 0;
        while(mid<=right){
            int temp;
            if(nums[mid] == 0){
                temp = nums[left];
                nums[left] = nums[mid];
                nums[mid]= temp;
                left++;
                mid++;
            }
            else if(nums[mid]== 2){
                temp = nums[right];
                nums[right] = nums[mid];
                nums[mid]= temp;
                right--;
            }
            else{
                mid++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}