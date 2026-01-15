class Solution {
    public String replaceDigits(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                result.append(c);
            } 
            else {
                int digit = c - '0';
                char prevChar = result.charAt(result.length() - 1);
                char newChar = (char) ('a' + (prevChar - 'a' + digit));
                result.append(newChar);
            }
        }

        return result.toString();
    }
}
