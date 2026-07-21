class Solution {
    public boolean isPalindrome(String s) {
        String filteredString = s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        return checkPalindrome(filteredString);
    }
    private static boolean checkPalindrome(String s){
        int left = 0 ;
        int right = s.length()-1;

        while(left<=right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}