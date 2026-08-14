class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0 ;
        int ans = 0 ;
        for(int right = 0 ; right<s.length() ; right++){
            char ch = s.charAt(right);
            freq.put(ch, freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>2){
                char leftchr = s.charAt(left);
                freq.put(leftchr,freq.get(leftchr)-1);
                left++;
            }
            ans = Math.max(ans , right-left+1);
        }

        return ans;
    }
}