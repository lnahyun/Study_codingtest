import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i<N; i++) {
            String[] ip = br.readLine().split(" ");
            if(ip[0].equals("1")) {
                int X = Integer.parseInt(ip[1]);
                deque.addFirst(X);
            }
            if(ip[0].equals("2")) {
                int X = Integer.parseInt(ip[1]);
                deque.addLast(X);
            }
            if(ip[0].equals("3")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.pollFirst()).append('\n');
                } else sb.append("-1").append('\n');
            }
            if(ip[0].equals("4")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.pollLast()).append('\n');
                } else sb.append("-1").append('\n');
            }
            if(ip[0].equals("5")) {
                sb.append(deque.size()).append('\n');
            }
            if(ip[0].equals("6")) {
                if(deque.isEmpty()) sb.append(1).append('\n');
                else sb.append(0).append('\n');
            }
            if(ip[0].equals("7")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.peekFirst()).append('\n');
                } else sb.append("-1").append('\n');
            }
            if(ip[0].equals("8")) {
                if(!deque.isEmpty()) {
                    sb.append(deque.peekLast()).append('\n');
                } else sb.append("-1").append('\n');
            }
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb);
    }
}
