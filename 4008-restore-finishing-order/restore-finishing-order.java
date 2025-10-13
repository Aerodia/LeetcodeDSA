class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> frndorder = new HashSet<>();
        for(int num:friends){
            frndorder.add(num);
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i<order.length ; i++){
            if(frndorder.contains(order[i])){
                result.add(order[i]);
            }
        }
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }
}