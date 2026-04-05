class Solution {
    public boolean judgeCircle(String moves) {
        int countofL = 0 ;
        int countofR = 0 ;
        int countofU = 0 ;
        int countofD = 0 ;
        for(int i = 0 ; i<moves.length();i++){
            if(moves.charAt(i) == 'L') countofL++;
            else if(moves.charAt(i) == 'R'){
                countofR++;
            }
            else if(moves.charAt(i) == 'U'){
                countofU++;
            }
            else if(moves.charAt(i) == 'D'){
                countofD++;
            }
        }
        if(countofR == countofL && countofD == countofU) return true;
        return false;   
    }
}