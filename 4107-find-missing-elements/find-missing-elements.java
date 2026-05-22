class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashSet<Integer> freq = new HashSet<>();
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length;i++){
            low = Math.min(low,nums[i]);
            high = Math.max(high,nums[i]);
            freq.add(nums[i]);
        }
        for(int j = low ; j<=high ; j++){
            if(!freq.contains(j)){
                result.add(j);
            }
        }
        return result;
    }
}