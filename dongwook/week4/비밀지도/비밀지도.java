package Study_codingtest.dongwook.week4;

class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] arr = new String[arr1.length];
        int idx = 0;
        for (int i = 0; i < arr1.length; i++) {
            int binary = arr1[i] | arr2[i];
            String s = String.format("%" + n + "s", Integer.toBinaryString(binary)).replace(' ', '0');
            arr[idx++] = s;
        }
        int idx2 = 0;
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[idx2++] = sb.toString();
        }
        return answer;
    }
}
