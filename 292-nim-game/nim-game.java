class Solution {
    public boolean canWinNim(int n){
        if(n==1 || n%4!=0) return true;
        return false;
    }
}