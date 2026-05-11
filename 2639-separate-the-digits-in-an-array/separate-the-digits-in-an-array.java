class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 ; i <nums.length;i++){
            if(nums[i]< 10){
                result.add(nums[i]);
            }
            else{
                String s = Integer.toString(nums[i]);
                int n;
                for(int j = 0 ;j<s.length();j++){
                    n = s.charAt(j) - '0';
                    result.add(n);
                }
            }
        }
        int[] array = result.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}