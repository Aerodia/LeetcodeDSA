class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1 ; i<nums.length ; i++){
            if(isspecial(nums[i]) == isspecial(nums[i-1])) return false;
            
        }
        return true;
    }
    public String isspecial(int x){
        if(x%2 == 1) return "Odd";
        else return "Even";
    }
    
}