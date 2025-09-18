class Solution {
    public int reverseDegree(String s) {
       int total = 0 ;
       for(int i = 0 ; i<s.length();i++){
        char currentChar = s.charAt(i);
            int reversedAlphaValue = 26 - (currentChar - 'a');
            int stringPosition = i + 1;
            total += reversedAlphaValue * stringPosition;
       }
       return total;
    }
}