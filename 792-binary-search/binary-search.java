class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        int mid = nums.length/2;
        if(mid<2){
            for(int i = 0 ;i<nums.length;i++){
                if(nums[i] == target){
                    index = i;
                }
            }
        }
        if(target>nums[mid]){
            for(int i = mid ; i<nums.length;i++){
                if(nums[i] == target){
                    index = i;
                }
            }
        }
        else{
            for(int i = 0 ; i<mid ; i++){
                if(nums[i] == target){
                    index = i;
                }
            }
        }
        return index;
    }
}