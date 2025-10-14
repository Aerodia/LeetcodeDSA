class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            for(int j = 0 ; j<t.length();j++){
                int diffofindex = 0;
                if(s.charAt(i) == t.charAt(j)){
                    diffofindex = Math.abs(i-j);
                    
                }
                sum+=diffofindex;
            }
        }
        return sum;
    }
}