import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] order) {
        //기존 컨테이너 벨트에서 몇 번째 상자까지 넣었는가
        int stackCount = 1; 
        int result = 0;
        Stack<Integer> stack = new Stack<>();
      
        for(int i = 0; i<order.length; i++) {
            int outBox = order[i];
            //보조 컨테이너 벨트에 보관
            while(stackCount <= outBox)
                stack.push(stackCount++);
            
            //보내야 하는 상자가 보조 컨테이너 벨트의 꼭대기에 존재
            if(!stack.isEmpty() && stack.peek() == outBox) {
                 stack.pop();
                 result++;  
            }
            else {
                return result;       
            }
        }
        //모든 상자를 트럭에 실을 수 있을 때
        return result;
    }
    
}
