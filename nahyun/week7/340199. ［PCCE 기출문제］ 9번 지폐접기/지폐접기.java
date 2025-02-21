class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletMax = (wallet[0] > wallet[1]) ? wallet[0] : wallet[1];
        int walletMin =(wallet[0] < wallet[1]) ? wallet[0] : wallet[1];
        while(true) {
            if(bill[0] >= bill[1]) {
                if(walletMax >= bill[0] && walletMin >= bill[1]) {
                return answer;
            }
                bill[0] /= 2;
            }
            else {
                if(walletMax >= bill[1] && walletMin >= bill[0]) {
                return answer;
            }
                bill[1] /= 2;
            }
            answer++;
        }
    }
}
