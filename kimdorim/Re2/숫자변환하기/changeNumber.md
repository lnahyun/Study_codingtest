# 숫자 변환하기
   - https://school.programmers.co.kr/learn/courses/30/lessons/12905?language=cpp

## 문제 설명
자연수 x를 y로 변환하려고 합니다. 사용할 수 있는 연산은 다음과 같습니다.

x에 n을 더합니다
x에 2를 곱합니다.
x에 3을 곱합니다.
자연수 x, y, n이 매개변수로 주어질 때, x를 y로 변환하기 위해 필요한 최소 연산 횟수를 return하도록 solution 함수를 완성해주세요. 이때 x를 y로 만들 수 없다면 -1을 return 해주세요.

제한사항
1 ≤ x ≤ y ≤ 1,000,000
1 ≤ n < y

## 알고리즘
BFS 사용
for문 에서 가능한 세 가지 연산을 수행하고 목표값을 초과하지 않는 값에 대해서 큐에 추가 후 다음 반복 때 큐에서 꺼내어 반복

