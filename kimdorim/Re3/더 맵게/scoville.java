import java.util.PriorityQueue;

class scoville {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> temp = new PriorityQueue();
        for( int tempS : scoville ){
            temp.add(tempS);
        }
        
        int count =0;
        while(temp.size() > 1 && temp.peek() < K){
            int first = temp.poll();
            int sec = temp.poll();
            int mixed = first + 2*sec;
            temp.add(mixed);
            count++;
        }
        
        return (temp.peek()>=K) ? count:-1; 
    }
}