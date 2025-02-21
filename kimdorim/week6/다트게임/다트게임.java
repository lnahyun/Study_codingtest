public class 다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        int[] dart = new int[3];

        int idx=0;
        int score =0;
        int flag = 0;


        for(int i=0;i<dartResult.length();i++){
            char c = dartResult.charAt(i);

            if(c>='0'&&c<='9'){
                if(flag == 1){
                    score *= 10;
                }
                score += c-'0';
                flag = 1;
            }


            else if(c=='S'||c=='D'||c=='T'){
                if(c=='S'){
                    dart[idx++]=score;
                }
                else if(c=='D'){
                    dart[idx++]=score * score;
                }
                else{
                    dart[idx++]=score * score * score;
                }
                score =0;
                flag = 0;
            }


            else {
                if(c=='*'){
                    dart[idx-1]*=2;
                    if(idx-2>=0) dart[idx-2]*=2;
                }
                else {
                    dart[idx-1]*=(-1);
                }
            }
        }

        answer=dart[0]+dart[1]+dart[2];

        return answer;
    }
}