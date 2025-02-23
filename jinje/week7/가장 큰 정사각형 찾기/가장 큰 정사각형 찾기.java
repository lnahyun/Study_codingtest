package week7;

public class sqare {
	public static int solution(int [][]board) {
		int max = 0;
		int row = board.length;
		int col = board[0].length;
		
		int[][] dp = new int[row][col];
		
		for (int i = 0; i< row; i++) {
			for (int j = 0; j < col; j++) {
				if (i == 0 || j == 0)
					dp[i][j] = board[i][j];
				else if (board[i][j] == 1)
					dp[i][j] = Math.min(Math.min(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]) + 1;
				
				max = Math.max(max, dp[i][j]);
			}
		}
		return max * max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(solution(board));
	}
}
