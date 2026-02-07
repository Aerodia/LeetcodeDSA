class Solution{
    public int minimumDeletions(String s) {
    int deletions = 0;
    int bCount = 0;
    
    for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'b') {
            bCount++;
        } else {
            if (bCount > 0) {
                deletions++;
                bCount--;
            }
        }
    }
    
    return deletions;
    }
}