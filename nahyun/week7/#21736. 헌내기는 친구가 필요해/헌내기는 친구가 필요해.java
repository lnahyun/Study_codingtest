import java.util.*;
import java.io.*;

public class Main {
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] campus = new String[N+2][M+2];

        //도연이 위치 저장 & 배열에 옮기기
        int dyX = 0; int dyY = 0;
        for(int i = 1; i<=N; i++) {
            String[] line = br.readLine().split("");
            for (int j = 1; j <= M; j++) {
                campus[i][j] = line[j - 1];
                if (campus[i][j].equals("I")) {
                    dyX = i;
                    dyY = j;
                }
            }
        }
        answer = 0;
        boolean[][] check = new boolean[N+2][M+2];

        dfs(check, campus, dyX, dyY, N, M);
        if(answer == 0) System.out.println("TT");
        else System.out.println(answer);

        return;
    }
    public static void dfs(boolean[][] check, String[][] campus, int x, int y, int maxX, int maxY) {
        //범위 초과
        if(x < 1 || x > maxX || y < 1 || y > maxY) return;
        //방문하지 않음
        if(!check[x][y] && campus[x][y] != null && !(campus[x][y].equals("X"))) {
            check[x][y] = true;
            if(campus[x][y].equals("P"))  {
                answer++;
            }
            dfs(check, campus, x, y+1, maxX, maxY); //동
            dfs(check, campus, x, y-1, maxX, maxY); //서
            dfs(check, campus, x+1, y, maxX, maxY); //남
            dfs(check, campus, x-1, y, maxX, maxY); //북
        }
    }
}
출처: https://llhyun.tistory.com/entry/JAVA-Silver-II-21736-헌내기는-친구가-필요해 [ID llhyun:티스토리]
