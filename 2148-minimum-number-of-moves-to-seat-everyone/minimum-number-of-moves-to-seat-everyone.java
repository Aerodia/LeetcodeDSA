class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int count = 0 ;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i = 0 ; i<students.length ; i++){
            for(int j = 0 ; j<seats.length ; j++){
                int curr = Math.abs(seats[j] - students[i]);            
                count = count + curr;
                i++;
            }
        }
        return count;
    }
}