class Solution {
    public int mirrorDistance(int n) {
       int distance = Math.abs(n - reverse(n));
       return distance; 
    }

    public int reverse(int n) {
    int reverse = 0;
    
    while (n != 0) {
        int num = n % 10;
        reverse = reverse * 10 + num; 
        n = n / 10;                
    }
    
    return reverse;
    }
}