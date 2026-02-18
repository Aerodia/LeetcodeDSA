class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = "";
        while(n>0){
            int remainder = n % 2 ;
            n/=2;
            binary = Integer.toString(remainder) + binary;
        }
        for(int i = 1 ; i<binary.length();i++){
            if(binary.charAt(i) == '0' && binary.charAt(i-1) == '0') return false;
            if(binary.charAt(i) == '1' && binary.charAt(i-1) == '1') return false;
        }
        return true;
    }
}