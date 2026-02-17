class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for(int hour = 0 ; hour<12 ; hour++){
            for(int minutes = 0 ; minutes<60;minutes++){
                int total = Integer.bitCount(hour) + Integer.bitCount(minutes);
            if(total == turnedOn){
                result.add(hour + ":" + String.format("%02d",minutes));
            }
            }
        }
        return result;
    }
}