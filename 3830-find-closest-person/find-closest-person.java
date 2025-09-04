class Solution {
    public int findClosest(int x, int y, int z) {
        int min = Integer.MIN_VALUE;
        int distanceofx = Math.abs(z - x);
        int distanceofy = Math.abs(z - y);
        if(distanceofx == distanceofy) return 0;
        min = Math.min(distanceofx , distanceofy);
        if(min == distanceofx) return 1;
        else if(min == distanceofy) return 2;
        else return 0;
    }
}