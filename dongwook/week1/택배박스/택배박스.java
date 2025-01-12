package week1;

import java.util.*;

class 택배박스 {
    public int solution(int[] order) {
        int idx = 0; // idx는 배달해야할 택배의 순서
        // 택배를 임시로 저장할 스택
        Stack<Integer> stack = new Stack<>();
        // 1번 택배부터 시작해서 차례대로 처리
        for (int i = 0; i < order.length; i++){
            stack.push(i+1); // 스택에 현재 택배(i+1)를 넣음
            
            // 스택에 있는 택배를 확인하면서, 순서대로 배달할 수 있는지 확인
            while(!stack.isEmpty()){
                // 스택의 맨 위 택배가 현재 배달해야 할 택배(order[idx])와 같으면 배달
                if (stack.peek() == order[idx]){
                    stack.pop(); // 해당 택배 배달
                    idx++; // 배달할 다음 택배로 이동
                }
                else
                    break;
            }
        }
        return idx; // 배달된 택배의 개수를 반환
    }
}
