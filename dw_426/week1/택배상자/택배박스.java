import java.util.*;

class Solution {
    public int solution(int[] order) {
        int idx = 0;
        Stack<Integer> stack = new Stack<>();
        // 스택에 물건 쌓는 과정
        for (int i = 0; i < order.length; i++){
            stack.push(i+1);
            // 스택에서 물건 꺼내기 과정
            while(!stack.isEmpty()){
                if (stack.peek() == order[idx]){
                    stack.pop();
                    idx++;
                }
                else
                    break;
            }
        }
        // 최종 반환 값
        return idx;
    }
}
