class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        HashMap<Integer,Integer> map = new HashMap<>();
        int commonCount = 0 ;
        for(int i= 0 ; i<n;i++){
            int numA = A[i];
            map.put(numA,map.getOrDefault(numA,0)+1);
            if(map.get(numA) == 2){
                commonCount++;
            }
            int numB = B[i];
            map.put(numB,map.getOrDefault(numB,0)+1);
            if(map.get(numB) == 2){
                commonCount++;
            }
            C[i] = commonCount;
        }
        return C;
    }
}