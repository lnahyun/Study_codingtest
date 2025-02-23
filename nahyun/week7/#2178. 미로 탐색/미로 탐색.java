import java.util.*;
import java.io.*;

public class Main {
    public static class Xy {
        int x, y;

        public Xy(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] maze = new char[N][M];
        int[][] dist = new int[N][M]; // 거리 계산
        int[] dx = {-1, 1, 0, 0}; //상하좌우 x좌표
        int[] dy = {0, 0, -1, 1}; //상하좌우 y좌표
        Queue<Xy> queue = new LinkedList<>();

        for(int i = 0; i<N; i++) {
            String line = br.readLine();
            for(int j = 0; j<M; j++) {
                maze[i][j] = line.charAt(j); //굳이 split배열 쓰지 말고 문자열에서 charAt하기
                dist[i][j] = -1; //거리 -1로 세팅해서 방문 여부 확인하기
            }
        }
        queue.offer(new Xy(0,0));
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Xy xy = queue.poll();

            //상하좌우 계산
            for(int i = 0; i<4; i++) {
                int calX = xy.x + dx[i];
                int calY = xy.y + dy[i];

                //벽에 부딪히거나, 범위 검사
                if(calX < 0 || calX >= N || calY < 0 || calY >= M) continue;
                //길이 아니거나 방문한 좌표 검사
                if(maze[calX][calY] == '0' || dist[calX][calY] != -1) continue;

                queue.offer(new Xy(calX, calY));
                dist[calX][calY] = dist[xy.x][xy.y] + 1;
            }
        }
        System.out.println(dist[N-1][M-1] + 1);
    }
}
출처: https://llhyun.tistory.com/ [ID llhyun:티스토리]
