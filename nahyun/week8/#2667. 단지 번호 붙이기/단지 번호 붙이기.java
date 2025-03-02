import java.io.*;
import java.util.*;

public class Main {
    static int homeCount;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] map = new int[N][N];
        for(int i = 0; i<N; i++) {
            String line = br.readLine();
                for(int j = 0; j<N; j++) {
                    map[i][j] = Integer.parseInt(String.valueOf(line.charAt(j)));
                }
        }

        List<Integer> list = new ArrayList<>();
        int allCount = 0;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(map[i][j] == 1) {
                    homeCount = 0;
                    allCount++;
                    dfs(map, N, i, j);
                    list.add(homeCount);
                }
            }
        }
        Collections.sort(list);
        System.out.println(allCount);
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void dfs(int[][] map, int N, int x, int y) {
        if(x<0 || x>=N || y<0 || y>=N) return;
        if(map[x][y] == 1) {
            homeCount++;
            map[x][y] = 0;
            dfs(map, N, x-1, y); //북
            dfs(map, N, x, y+1); //동
            dfs(map, N, x+1, y); //남
            dfs(map, N, x, y-1); //서
        }
    }
}
출처: https://llhyun.tistory.com/entry/JAVA-Silver-I-2667-단지-번호-붙이기 [ID llhyun:티스토리]
