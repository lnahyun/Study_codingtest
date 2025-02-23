package week7;

public class bill {
	public static boolean check(int[] wallet, int[] bill) {
        if (wallet[0] >= bill[0] && wallet[1] >= bill[1]) {
            return (false);
        }
        if (wallet[1] >= bill[0] && wallet[0] >= bill[1]) {
            return (false);
        }
        return (true);
    }
    
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while (check(wallet, bill)) {
            answer++;
            if (bill[0] > bill[1])
                bill[0] /= 2;
            else
                bill[1] /= 2;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wallet = {50, 50};
		int[] bill = {100, 241};
		int answer = solution(wallet, bill);
		System.out.println(answer);
	}
}
