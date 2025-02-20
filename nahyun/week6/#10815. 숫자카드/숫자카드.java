import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String[] num = new String[N];

        for(int i = 0; i<N; i++) {
            num[i] = st.nextToken();
        }

        Arrays.sort(num);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        String[] inputNum = new String[M];

        for(int i = 0; i<M; i++) {
            inputNum[i] = st.nextToken();
        }


        //비교 로직 (이분탐색)
        for(int i = 0; i<M; i++) {
            int index = Arrays.binarySearch(num, inputNum[i]);
            if(index < 0)
                sb.append(0).append(" ");
            else sb.append(1).append(" ");
        }

        sb.setLength(sb.length()-1);
        System.out.print(sb);



            }
        }
