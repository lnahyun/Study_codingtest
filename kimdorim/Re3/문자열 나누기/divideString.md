# 문자열나누기
   - https://school.programmers.co.kr/learn/courses/30/lessons/140108

## 문제 설명
문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.

먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.

제한사항
1 ≤ s의 길이 ≤ 10,000
s는 영어 소문자로만 이루어져 있습니다.


## 알고리즘
제일 처음에는 첫 번째 문자만을 저장하여 반복문을 돌며 두 번째 문자부터 첫 번째 문자와의 동일성을 비교하며 진행하다가 다른 문자가 나온 횟수와 첫 번째 문자가 나온 횟수가 동일할 때에 다음 문자로 첫 번째 문자를 바꾼 뒤 두 횟수를 0으로 초기화하여 다음 문자를 읽었을 때 1이 되도록 한 뒤 같은 방식으로 진행 이후 문자가 남았을 때 1을 추가하여 최종 답을 반환한다.

