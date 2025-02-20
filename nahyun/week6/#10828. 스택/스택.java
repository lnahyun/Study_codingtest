import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> Stack = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i<N; i++) {
            String[] Line = br.readLine().split(" ");

            if(Objects.equals(Line[0], "push")) {
                Stack.add(Integer.parseInt(Line[1]));
                }

            if(Objects.equals(Line[0], "pop")) {
                if(Stack.isEmpty())
                    System.out.print("-1" + "\n");
                else {
                    System.out.print(Stack.getLast() + "\n");
                    Stack.removeLast();
                }
            }

            if(Objects.equals(Line[0], "size")) {
                System.out.print(Stack.size() + "\n");
            }

            if(Objects.equals(Line[0], "empty")) {
                if(Stack.isEmpty())
                    System.out.print("1" + "\n");
                else System.out.print("0" + "\n");
            }

            if(Objects.equals(Line[0], "top")) {
                if(Stack.isEmpty())
                    System.out.print("-1" + "\n");
                else System.out.print(Stack.getLast() + "\n");
            }

        }
        }
    }
