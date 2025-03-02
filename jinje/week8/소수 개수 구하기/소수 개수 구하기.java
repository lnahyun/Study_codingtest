package week8;

public class prime {
	public static boolean check(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
	
	public static String baseK(int n, int k) {
		StringBuilder result = new StringBuilder();
		
		while (n > 0) {
			result.append(n % k);
			n = n / k;
		}
		return result.reverse().toString();
	}
	
	public static int solution(int n, int k) {
		int answer = 0;
		String knum = baseK(n, k);
		String[] split = knum.split("0");
		
		for (String str : split) {
			if(!str.isEmpty()) {
				int num = Integer.parseInt(str);
				if (check(num))
					answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution(437674, 3));
	}
}
