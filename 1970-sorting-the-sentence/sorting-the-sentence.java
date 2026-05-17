class Solution {
    public String sortSentence(String s) {
        String[] wordsArray = new String[10]; 
        StringBuilder currentWord = new StringBuilder();
        int wordCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int index = ch - '0'; 
                wordsArray[index] = currentWord.toString();
                currentWord.setLength(0); 
                wordCount++;
            } 
            else if (ch != ' ') {
                currentWord.append(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= wordCount; i++) {
            result.append(wordsArray[i]);
            if (i < wordCount) {
                result.append(" "); 
            }
        }
        return result.toString();
    }
}