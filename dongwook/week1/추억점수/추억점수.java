package week1;

class 추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 각 사진에 대해 추억 점수의 합을 저장할 배열
        int[] answer = new int[photo.length];

        // 사진 배열을 순차적으로 처리
        for (int i = 0; i < photo.length; i++){
            // 각 사진에 등장하는 사람을 순차적으로 확인
            for (int j = 0; j < photo[i].length; j++){
                // 모든 사람의 이름을 확인하여 추억 점수를 합산
                for (int k = 0; k < name.length; k++){
                    // 사진에 등장하는 사람(photo[i][j])이 이름 목록(name[k])에 있을 경우
                    if (photo[i][j].equals(name[k]))
                        answer[i] += yearning[k]; // 그 사람의 추억 점수를 해당 사진의 점수에 더함
                }
            }
        }
        return answer; // 모든 사진에 대한 추억 점수 합을 담은 배열 반환
    }
}
