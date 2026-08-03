class Solution {
    public int countSeniors(String[] details) {
        int count = 0 ;
        for(int i = 0 ; i < details.length ; i++){

            String detail = details[i];
            int age = (detail.charAt(11) - '0') * 10 + (detail.charAt(12) - '0');
            if(age>60){
                count++;
            }
        }
        return count;
    }
}