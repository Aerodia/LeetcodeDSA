class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!map.containsKey(num)) {
                map.put(num, new int[]{1, i, i}); 
            } else {
                int[] info = map.get(num);
                info[0]++;      
                info[2] = i;    
            }
        }
        int degree = 0;
        int minLength = 0;
        for (int[] info : map.values()) {
            int count = info[0];
            int firstIndex = info[1];
            int lastIndex = info[2];
            
            if (count > degree) {
                degree = count;
                minLength = lastIndex - firstIndex + 1;
            } else if (count == degree) {
                minLength = Math.min(minLength, lastIndex - firstIndex + 1);
            }
        }
        return minLength;
    }
}