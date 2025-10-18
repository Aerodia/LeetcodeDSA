class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder toreverse = new StringBuilder();
        StringBuilder notreverse = new StringBuilder();
        int index = 0;
        int count = 0;
        for(int i = 0 ; i<word.length();i++){
            if(word.charAt(i) != ch){
                toreverse.append(word.charAt(i));
            }
            else if(word.charAt(i) ==ch){
                toreverse.append(word.charAt(i));
                count++;
                index = i;
                break;
            }
        }
        if(count == 0) return word;
        for (int i = index + 1; i < word.length(); i++) {
            notreverse.append(word.charAt(i));
        }

        toreverse.reverse();
        String result = toreverse.toString() + notreverse.toString();
        return result;
    }
}