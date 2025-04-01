import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int last = -1;

        for (int i = 0; i < N; i++) {
            String[] ip = br.readLine().split(" ");
            String cmd = ip[0];

            switch (cmd) {
                case "push":
                    int x = Integer.parseInt(ip[1]);
                    queue.add(x);
                    last = x;
                    break;
                case "pop":
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.poll()).append('\n');
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append('\n');
                    break;
                case "front":
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(queue.peek()).append('\n');
                    break;
                case "back":
                    if (queue.isEmpty()) sb.append("-1\n");
                    else sb.append(last).append('\n');
                    break;
            }
        }

        System.out.print(sb);
    }
}
