class Solution {
    private boolean hasNoZeros(int num) {
        return !String.valueOf(num).contains("0");
    }

    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (hasNoZeros(a) && hasNoZeros(b)) {
                return new int[]{a, b};
            }
        }
        return new int[]{};
    }
}