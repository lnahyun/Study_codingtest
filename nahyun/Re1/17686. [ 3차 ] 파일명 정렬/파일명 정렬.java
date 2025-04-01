import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        //Test Case 받기
        int t_Case = Integer.parseInt(br.readLine());
        for (int i = 0; i < t_Case; i++) {
            Deque<Integer> deque = new ArrayDeque<>();
            String Function = br.readLine();
            int num = Integer.parseInt(br.readLine());
            String Case = br.readLine();
            if (Case.length() == 2 && Function.indexOf('D')>=0) {
                sb.append("error").append('\n');
                continue;
            }
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < Case.length(); j++) {
                if(Case.charAt(j)=='[' ||Case.charAt(j)==']'||Case.charAt(j)==','){
                    if(temp.length()!=0){
                        deque.add(Integer.parseInt(temp.toString()));
                        temp.setLength(0);
                    }
                }
                else{
                    temp.append(Case.charAt(j));
                }
            }
            int start = 0;
            int end = deque.size()-1;
            //함수 구현
            boolean errorSt = false;
            for (int k = 0; k < Function.length(); k++) {
                //R이 나오면 뒤집기
                if (Function.charAt(k) == 'R') {
                    int tempNum = start;
                    start = end;
                    end = tempNum;
                }
                //D가 나오면 첫 번째 수 버리거나 에러 처리
                else {
                    if (deque.isEmpty()) { //배열이 비어있을 때 오류처리
                        errorSt = true;
                        break;
                    } else {
                        if(end ==0 && start==0){
                            deque.removeLast();
                        }
                        else if(end==0){
                            deque.removeLast();
                            start--;
                        }else {
                            deque.removeFirst();
                            end--;
                        }
                    }
                }
            }
            if (errorSt) {
                sb.append("error" + "\n");
            } else {
                sb.append("[");
                if(!deque.isEmpty()){
                    if(start>=end){
                        for(int k = end; k<=start; k++){
                            sb.append(deque.pollLast()+",");
                        }
                    }else{
                        for(int k = start; k<=end; k++){
                            sb.append(deque.pollFirst()+",");
                        }
                    }
                    sb.deleteCharAt(sb.length() - 1);
                }
                sb.append("]").append('\n');
            }
        }
        System.out.print(sb);
    }
}
