  class Solution {
    public int[] answer = new int[2];
    public int[][] arr;
    
    public int[] solution(int[][] arr) {
        int N = arr.length;
        this.arr =arr;
        divide(0,0,N);
        return answer;       
    }
    public void divide(int x, int y, int n){
            int start = arr[x][y];
            for(int i=x;i<x+n;i++){
                for(int j=y;j<y+n;j++){
                    if(start != arr[i][j]){
                        n /= 2;
                        divide(x,y,n);
                        divide(x+n,y,n);
                        divide(x,y+n,n);
                        divide(x+n,y+n,n);
                        return;
                    }
                }
            }
            answer[start] +=1;
            
        }
}
