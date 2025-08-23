class Solution {
    public boolean isPalindrome(String s) {
        String filteredString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return checkpalindrome(filteredString);   
    }
    private boolean checkpalindrome(String m){
        int left = 0;
        int right = m.length() -1 ;
        while(left<right){
            if(m.charAt(left) != m.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}