class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isNegative = num < 0;
        num = Math.abs(num);

        String ans = "";
        while (num > 0) {
            int n = num % 7;
            num /= 7;
            ans = n + ans;
        }
        return isNegative ? "-" + ans : ans;
    }
}