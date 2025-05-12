class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String aya = "aya";
        String ye = "ye";
        String woo = "woo";
        String ma = "ma";
        String tmp = "";
        String before = "";

        for(int i=0; i< babbling.length; i++){
            String word = babbling[i];
            before = "";

            while(word.length() > 0){
                boolean matched = false;

                if(word.length() >= 2){
                    tmp = word.substring(0,2);
                    if(tmp.equals(ye) && !before.equals(ye)){
                        word = word.substring(2);
                        before = ye;
                        matched = true;
                    }

                    else if(tmp.equals(ma) && !before.equals(ma)){
                        word = word.substring(2);
                        before = ma;
                        matched = true;
                    }
                }

                if(!matched && word.length() >= 3){
                    tmp = word.substring(0,3);
                    if(tmp.equals(aya) && !before.equals(aya)){
                        word = word.substring(3);
                        before = aya;
                        matched = true;
                    }

                    else if(tmp.equals(woo) && !before.equals(woo)){
                        word = word.substring(3);
                        before = woo;
                        matched = true;
                    }
                }

                if(!matched) break;
            }

            if(word.length() == 0) answer++;

        }

        return answer;
    }
}