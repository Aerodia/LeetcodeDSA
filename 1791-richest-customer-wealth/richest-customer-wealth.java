class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0 ;
        int curr = 0;
        for(int i = 0 ; i<accounts.length ; i++){
            for(int j = 0 ; j<accounts[i].length;j++){
                curr = curr + accounts[i][j];
                max = Math.max(curr,max);
            }
            curr = 0;
        }
        return max;
    }
}