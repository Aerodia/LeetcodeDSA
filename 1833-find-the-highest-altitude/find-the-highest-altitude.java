class Solution {
    public int largestAltitude(int[] gain) {
        int check = 0;
        int sum = Integer.MIN_VALUE;
        for(int i=0 ;i<gain.length;i++){
            check = check +gain[i];
            sum = Math.max(sum,check);
        }
        if(sum<0) return 0;
        return sum;
    }  
}