import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        String[] outCar = new String[N];
        //터널 안으로 들어오는 순서 map에 저장
        for(int i = 0; i<N; i++) {
            String input = br.readLine();
            map.put(input, i);
        }
        //나가는 순서 배열에 저장
        for(int i = 0; i<N; i++) {
            outCar[i] = br.readLine();
        }
        int result = 0;
        //추월하였는지 검사
        for(int i = 0; i<N-1; i++) {
            int standard = map.get(outCar[i]);
            for(int j = i+1; j<N; j++) {
                int compare = map.get(outCar[j]);
                if(standard > compare) {result++; break;}
            }
        }

        System.out.println(result);
    }

}
