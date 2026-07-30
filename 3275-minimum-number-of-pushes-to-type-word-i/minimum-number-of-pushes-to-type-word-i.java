class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int k = n/8;
        int r = n%8;
        int count = (k+1)*(4*k+r);
        return count;
    }
}