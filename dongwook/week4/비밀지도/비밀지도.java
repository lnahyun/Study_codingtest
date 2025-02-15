package Study_codingtest.dongwook.week4;

class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] arr = new String[arr1.length];
        int idx = 0;
        for (int i = 0; i < arr1.length; i++) {
            int binary = arr1[i] | arr2[i]; // 비트 or 연산과정 
            String s = String.format("%" + n + "s", Integer.toBinaryString(binary)).replace(' ', '0'); // 이진수 문자열로 변환하고, n자리 맞추기 빈자리는 0
            arr[idx++] = s; // 결과 arr 배열에 저장하는 과정
        }
        int idx2 = 0; // answer 배열 인덱스
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(); // 문자열 조작을 위한 StringBuilder
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == '1') { // 1이면 "#"
                    sb.append("#");
                } else { // 0이면 " "공백
                    sb.append(" ");
                }
            }
            answer[idx2++] = sb.toString();
        }
        return answer;
    }
}
