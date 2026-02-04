class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] newArr = new int[points.length];
        for(int i = 0; i < points.length; i++){
            newArr[i] = points[i][0];
        }

        Arrays.sort(newArr);

        int biggestDiff = 0;
        for(int j = 1; j < newArr.length; j++){
            if(newArr[j] - newArr[j-1] > biggestDiff){
                biggestDiff = newArr[j] - newArr[j-1];
            }
        }
        return biggestDiff;
    }
}