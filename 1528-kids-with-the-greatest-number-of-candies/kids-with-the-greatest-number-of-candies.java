class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> highestCandies = new ArrayList<>();
      int max = 0;
      for(int i = 0; i < candies.length; i++) {
        if(candies[i] > max) {
          max = candies[i];
        }
      }
      for(int i = 0; i < candies.length; i++) {
        if(candies[i] + extraCandies >= max) {
          highestCandies.add(true);
        } else {
          highestCandies.add(false);
        }
      }

      return highestCandies;
    }
}