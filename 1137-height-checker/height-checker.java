class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for(int i = 0 ; i<heights.length;i++){
            for(int j= 0 ; j<expected.length;j++){
                if(heights[i] != expected[j]){
                    count++;
                }
                i++;
            }
        }
        return count;
    }
}