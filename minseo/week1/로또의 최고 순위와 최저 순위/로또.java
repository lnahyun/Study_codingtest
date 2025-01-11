import java.util.*;

class Solution {
    private int calPrize(int mathCnt){
        switch(mathCnt){
            case 6:
                return 1;
            case 5:
                return 2;
            case 4:
                return 3;
            case 3:
                return 4;
            case 2:
                return 5;
            default:
                return 6;
        }
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zeroCount = 0;
        int[] result = new int[2];
        
        for(int i = 0; i<6; i++){
            for(int ii=0; ii<6; ii++){
                if(lottos[i] == win_nums[ii])
                    count ++;
            }
        }
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0) zeroCount++;
        }
        
        int bestResult = calPrize(count+zeroCount); //bestCase
        int worstResult = calPrize(count); //worstCase
        
        result[0] = bestResult;
        result[1] = worstResult;
        
        return result;
    }
}
