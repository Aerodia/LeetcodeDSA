class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        long sum = 0 ;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(nums[i],max);
            prefixGcd[i] = gcd(max,nums[i]);
        }
        Arrays.sort(prefixGcd);
        int left = 0;
        int right = n - 1;

        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }  
        return sum;     
    }
    public static int gcd(int a , int b){
        if(b == 0 ) return a;
        return gcd(b,a%b);
    }
}