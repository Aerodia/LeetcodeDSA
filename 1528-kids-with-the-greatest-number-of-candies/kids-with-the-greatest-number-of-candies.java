class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for (int candyCount : candies) {
            if (candyCount > maxCandies) {
                maxCandies = candyCount;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candyCount : candies) {
            if (candyCount + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}