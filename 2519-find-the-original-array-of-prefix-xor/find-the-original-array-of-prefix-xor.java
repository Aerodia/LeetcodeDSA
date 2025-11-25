class Solution {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        int pre = 0;
        ans[0] = pref[0];
        for(int i=1;i<pref.length;i++){
            pre = pref[i] ^ pref[i-1];
            ans[i] = pre;
        }
        return ans;
    }
}