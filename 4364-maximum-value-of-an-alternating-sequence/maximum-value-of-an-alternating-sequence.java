class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n == 1) return s;

        long increase = Math.floorDiv(n , 2) ;
        long decrease = increase - 1;
        return s + increase*m - decrease ;
    }
}