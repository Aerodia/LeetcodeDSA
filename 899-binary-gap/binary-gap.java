class Solution {
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        int maxDistance = 0 ;
        int lastposition = -1;
        for(int i = 0 ; i<binary.length();i++){
            if(binary.charAt(i) == '1'){
                if(lastposition != -1){
                    maxDistance = Math.max(maxDistance , i - lastposition);
                }
                lastposition = i ;
            }
        }
        return maxDistance;
    }
}