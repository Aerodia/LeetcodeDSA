class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedchr = new HashSet<>();
        for(char c : allowed.toCharArray()){
            allowedchr.add(c);
        }
        int consistentcount = 0;
        for(String word: words){
            boolean isConsistent = true;
            for(char c : word.toCharArray()){
                if(!allowedchr.contains(c)){
                    isConsistent = false;
                    break;
                }
            }
            if(isConsistent) consistentcount++;
        }
        return consistentcount;
    }
}