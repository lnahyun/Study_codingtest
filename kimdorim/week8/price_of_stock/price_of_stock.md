# 주식 가격
   - https://school.programmers.co.kr/learn/courses/30/lessons/42584

## 문제 설명
   - 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

## 알고리즘
현재 가격과 스택 비교
스택의 마지막 가격이 현재 가격보다 크다면 떨어진 것
stack.pop() 해서 유지된 시간 계산
가격이 떨어진 경우 시간 계산
끝까지 유지된 가격 처리