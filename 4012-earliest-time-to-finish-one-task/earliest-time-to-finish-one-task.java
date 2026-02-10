class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<tasks.length;i++){
            for(int j = 0 ; j<2;j++){
                int add = tasks[i][0] + tasks[i][1];
                min = Math.min(min,add);
            }
        }
        return min;
    }
}