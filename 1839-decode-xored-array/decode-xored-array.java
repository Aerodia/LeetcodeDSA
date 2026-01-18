class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length+1];
        decoded[0] = first;
        for(int i = 1 ; i<encoded.length+1;i++){
            decoded[i] = first ^ encoded[i-1];
            first = decoded[i];
        }
        return decoded;
    }
}