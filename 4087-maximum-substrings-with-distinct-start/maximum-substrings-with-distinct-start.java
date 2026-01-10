class Solution {
    public int maxDistinct(String s) {
        int count = 0 ;
        boolean[] used = new boolean[26];
        for(char c : s.toCharArray()){
            int idx = c -'a';
            if(!used[idx]){
                used[idx] = true;
                count++;
            }
        }
        return count;
    }
}