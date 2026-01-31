class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0 ; 
        int right = letters.length - 1;
        char ans = letters[0];
        int mid = 0;
        while(left <= right){
            mid = left + (right - left) / 2;

            if (letters[mid] > target){
                ans = letters[mid];
                right--;
            }
            else{
                left++;
            }
        }
        return ans;
    }
}