class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i= 0 ; i<word.length();i++){
            result.put(word.charAt(i) , result.getOrDefault(word.charAt(i),0)+1);
        }
        int count = 0;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (result.containsKey(ch) && result.containsKey(Character.toUpperCase(ch))) {
                count++;
            }
        }
        return count;
    }
}