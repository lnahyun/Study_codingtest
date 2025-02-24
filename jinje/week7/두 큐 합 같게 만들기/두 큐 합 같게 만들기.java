package week7;

public class queue {
	public static int solution(int[] queue1, int[] queue2) {
		long sum1 = 0, sum2 = 0;
		int n = queue1.length;
		
		for (int num : queue1) sum1 += num;
		for (int num : queue2) sum2 += num;
		
		long total = sum1 + sum2;
		if (total % 2 != 0) 
			return -1;
		
		long target = total / 2;
		int[] q = new int[2 * n];
		System.arraycopy(queue1, 0, q, 0, n);
	    System.arraycopy(queue2, 0, q, n, n);
	        
	    int count = 0;
	    int i = 0, j = n;
	    int limit = 4 * n;
	        
	    while (count <= limit) {
	    	if (sum1 == target) {
	    		return count;
	    	}
	    	if (sum1 > target) {
	    		sum1 -= q[i];
	    		i = (i + 1) % (2 * n);
	    	}
	    	else {
	    		sum1 += q[j];
	    		j = (j + 1) % (2 * n);
	    	}
	    	count++;
	    }
	    return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] queue1 = {1, 2, 1, 2};
		int[] queue2 = {1, 10, 1, 2};
		int answer = solution(queue1, queue2);
		System.out.println(answer);
	}
}
