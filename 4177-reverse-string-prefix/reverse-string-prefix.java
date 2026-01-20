class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ;i<k ; i++){
            result.append(s.charAt(i));
        }
        result.reverse();
        for(int i = k ; i<s.length();i++){
            result.append(s.charAt(i));
        }
        return result.toString();
    }
}