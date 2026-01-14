class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int left = a.length() - 1;
        int right = b.length() - 1;
        while (left >= 0 || right >= 0 || carry != 0) {
            int digitA;
            if (left >= 0) {
                digitA = a.charAt(left) - '0';
            } else {
                digitA = 0;
            }
            int digitB;
            if (right >= 0) {
                digitB = b.charAt(right) - '0';
            } else {
                digitB = 0;
            }
            int sum = digitA + digitB + carry;
            ans.append(sum % 2);     
            carry = sum / 2;          
            left--;
            right--;
        }
        return ans.reverse().toString(); 
    }
}
