class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int count1 = 0;
        int count2 = 0;
        
        boolean check = true;
        for(int i = 0; i<goal.length; i++) {
            if(!check) break;
            //cards1에서 꺼낼 수 있을 때
            if(count1 < cards1.length && goal[i].equals(cards1[count1])) {
                count1++;
                continue;
            }
            //cards2에서 꺼낼 수 있을 때
            else if(count2 < cards2.length && goal[i].equals(cards2[count2])) { 
                count2++;
                continue;
            }
            check = false;
            break;
        }
        
        if(check) return "Yes";
        else return "No";
    }
}
