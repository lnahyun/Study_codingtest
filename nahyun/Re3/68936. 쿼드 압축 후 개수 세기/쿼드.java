class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        Quad(0, 0, arr.length, arr, answer);
        return answer;
    }
    
    public void Quad(int x, int y, int size, int[][] arr, int[] answer) {
        if(size == 1) {
            answer[arr[x][y]]++; return;
        }
        
        if(elementCheck(x, y, arr, size)) {
            answer[arr[x][y]]++; return;
        }
        else {
            int sizeNew = size/2;
            
            Quad(x, y, sizeNew, arr, answer);
            Quad(x, y+sizeNew, sizeNew, arr, answer);
            Quad(x+sizeNew, y, sizeNew, arr, answer);
            Quad(x+sizeNew, y+sizeNew, sizeNew, arr, answer);
        }
        
    }
    public boolean elementCheck(int x, int y, int[][] arr, int size) {
        int num = arr[x][y];
        boolean result = true;
        
        for(int i = x; i<x+size; i++) {
            for(int j = y; j<y+size; j++) {
                if(arr[i][j] != num) {
                    result = false; break;
                }
            }
            if(!result) break;
        }
        
        return result;
    }
}
