class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int max = Integer.MIN_VALUE ;
        int[] result = new int[points.length];
        int index = 0 ;
        for(int i = 0 ; i<points.length ; i++){
            result[index] = points[i][0];
            index++;
        }
        Arrays.sort(result);
        int diff = 0;
        for(int i = 1;i<result.length;i++){
            diff = result[i] - result[i-1];;
            max = Math.max(diff,max);
        }
        return max;
    }
}