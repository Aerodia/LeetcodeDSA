class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s.charAt(i))) leftCount++;
            if (isVowel(s.charAt(i + n / 2))) rightCount++;
        }

        return leftCount == rightCount;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
