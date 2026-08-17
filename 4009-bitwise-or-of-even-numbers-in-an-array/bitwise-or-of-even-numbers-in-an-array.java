class Solution {
    public int evenNumberBitwiseORs(int[] nums) {
        int x = 0;
        int bitwise = 0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]%2 == 0){
                x = nums[i];
                bitwise = bitwise | x ;
            }
        }
        return bitwise;
    }
}