class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int i = 0;
        while(i<nums.length){
            int max = nums[i];
            int min = nums[i];
            for(int j = 0 ; j<i ; j++){
                max = Math.max(max , nums[j]);
            }
            for(int a = i+1 ; a < nums.length ; a++){
                min = Math.min(min , nums[a]);
            }
            int score = max - min;
            if(score<=k){
                return i;
            }
            i++;
        } 
        return -1;
    }
}