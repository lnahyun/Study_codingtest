import java.io.*;
import java.util.*;

class position {
    int x;
    int y;

    public position(int x, int y) {
        this.y = y;
        this.x = x;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        Queue<position> queue = new LinkedList<>();

        //2차원 배열에 집어넣기
        int[][] box = new int[N][M];
        int zeroCount = 0;
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if(box[i][j] == 1) {
                    queue.add(new position(i, j));
                }
                else if(box[i][j] == 0) zeroCount++;
            }
        }

        if(queue.size() == N*M) {System.out.println(0); return;} //전부 1
        if(zeroCount == 0) {System.out.println(0); return;} //0이 하나도 없음

        int result = 0;
        while(true) {
            if(queue.isEmpty()) break;
            Queue<position> temp = new LinkedList<>(queue);
            queue.clear();
            int num = temp.size();
            for(int i = 0; i<num; i++) {
                position pos = temp.poll();
                //동
                if((check(pos.x, pos.y+1, box, M, N))) queue.add(new position(pos.x, pos.y+1));
                //서
                if((check(pos.x, pos.y-1, box, M, N))) queue.add(new position(pos.x, pos.y-1));
                //남
                if((check(pos.x+1, pos.y, box, M, N))) queue.add(new position(pos.x+1, pos.y));
                //북
                if((check(pos.x-1, pos.y, box, M, N))) queue.add(new position(pos.x-1, pos.y));
            }
            result++;
        }
        boolean c = true;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<M; j++) {
                if(box[i][j] == 0) {
                    c = false;
                    break;
                }
            }
        }
        if(!c) System.out.println(-1);
        else System.out.println(result-1);


    }
    public static boolean check(int x, int y, int[][] box, int M, int N) {
        if(x<0 || x>=N || y<0 || y>=M) return false;
        if(box[x][y] == 1 || box[x][y] == -1) return false;
        else {
            box[x][y] = 1;
            return true;
        }
    }
}
