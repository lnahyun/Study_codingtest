import java.io.*;
import java.util.*;
import java.math.*;


class Solution {
    static class Node {
        int x;
        int y;
    
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public String solution(int[] numbers, String hand) {
        Map<Integer, Node> keypad = new HashMap<>();
        //키패드 초기화
        int num = 0;
        for(int i = 0; i<3; i++) {
            for(int j = 0; j<3; j++) {
                keypad.put(++num, new Node(i, j));
            }
        }
        keypad.put(0, new Node(3, 1));
        
        StringBuilder sb = new StringBuilder();
        Node[] cur = new Node[2];
        int left=0; int right = 1;
        cur[left] = new Node(3, 0);
        cur[right] = new Node(3, 2);
        int handV = (hand.equals("right")) ? 1 : 0;
        //입력된 numbers 길이만큼 반복
        for(int i = 0; i<numbers.length; i++) {
            int number = numbers[i];
            Node pos = keypad.get(number);
            
            //왼쪽 키패드 -> 왼쪽 손가락
            if(pos.y == 0) {
                sb.append("L");
                cur[left].x = pos.x; cur[left].y = pos.y;
            }
            
            //오른쪽 키패드 -> 오른쪽 손가락
            else if(pos.y == 2) {
                sb.append("R");
                cur[right].x = pos.x; cur[right].y = pos.y;
            }
            
            //중간거
            else {
                int leftToLen = Math.abs(pos.x - cur[left].x) + Math.abs(pos.y - cur[left].y);
                int rightToLen = Math.abs(pos.x - cur[right].x) + Math.abs(pos.y - cur[right].y);
                
                if(leftToLen < rightToLen) {
                    sb.append("L");
                    cur[left].x = pos.x; cur[left].y = pos.y;
                }
                
                else if(leftToLen > rightToLen) {
                    sb.append("R");
                    cur[right].x = pos.x; cur[right].y = pos.y;
                }
                
                else{
                    if(handV == 0) sb.append("L");
                    else sb.append("R");
                    
                    cur[handV].x = pos.x; cur[handV].y = pos.y;
                }
            }
        }
        return sb.toString();
    }
}
