class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] res = new int[2]; 
        boolean[] seen = new boolean[nums.length];
        int index = 0;

        for (int num : nums) {
            if (seen[num]) {
                res[index++] = num;
                if (index == 2) break;
            } else {
                seen[num] = true;
            }
        }
        return res;
    }
}