1,2번은 공통문제이다.
### 1번 택배상자

📌 문제 설명

- 상자가 순서대로 놓여있는 컨테이너 벨트에서 상자를  **주어진 순서(order)**대로 실어야함. 상자를 싣기 위해 보조 컨테이너 벨트를 사용함. 이때 보조 벨트는 입구외엔 막혀있음. 컨테이너 벨트와 보조 벨트를 활용해 가능한 한 많은 상자를 순서대로 트럭에 싣고, 실을 수 있는 상자의 개수를 반환

 📌 문제 접근법

보조 벨트를 스택으로 이용함

처음에는 order과 상자 순서가 같아지면 order를 pop 했지만 복잡해지고 시간 복잡도 실패

→답지 참고했더니 상자 번호가 아닌 인덱스를 이용해서 order에 해당하는 박스까지 스택에 append하고 pop 했음

### 2번 성격유형 검사하기

📌 문제 설명

 mbti 검사와 유사함

📌 문제 접근법

각각의 부분에 대한 점수를 매겨서 양수, 음수를 판단하여 결과를 도출함

→ BUT 다른 풀이로 딕셔너리를 사용하는 방법이 있었음

📌 배운점 

파이썬 딕셔너리 사용을 공부해야겠다.

if문은 시간 복잡도에 영향을 미치지 않는다. BUT 남발하면 분기 예측 실패를 야기하며 프로그램 성능에 영향을 미친다.

### 3번 개미군단

📌 문제 설명

**프로그래머스 추천에 떠서 풀었는데 0lv 문제였음. 레벨 잘 봐야지...**

 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력 → 최소 수로 사냥

📌 문제 접근법

몫과 나머지를 이용한 단순 연산 문제였다.

### 4번 주차 요금 계산

[코딩테스트 연습 - 주차 요금 계산 | 프로그래머스 스쿨](https://school.programmers.co.kr/learn/courses/30/lessons/92341)

📌 문제 설명
출차하는 차들과 주차된 차들의 요금을 계산하는 문제임
주어진 요금표와 입/출차 기록을 기반으로 차량별 주차 요금을 계산함. 기본 시간 이하는 기본 요금만 부과하며, 초과 시간 발생 시 단위 시간마다 단위 요금을 추가하고 초과 시간이 단위 시간으로 나누어떨어지지 않으면 올림 처리함. 입차 후 출차 기록이 없으면 23:59에 출차된 것으로 간주하며, 차량 번호 오름차순으로 요금을 계산해 반환함. 입력은 [기본 시간, 기본 요금, 단위 시간, 단위 요금]으로 이루어진 요금표와 입/출차 내역이며, 출력은 차량 번호 순서로 정렬된 주차 요금


📌 문제 접근법

단계별로 나누어서 주차 시간을 분으로 계산하고 이를 바탕으로 시간을 계산해야겠다고 계획함

→ 시간 계산에서 리스트에 있는 각 변수를 쪼개고 원하는 자료형으로 바꾸는 작업이 필요했음(몰랐는데 알게됨), 이후 이 변수들과 if문을 이요하여 각각의 경우에 대해 계산하니 풀 수 있었음

📌 배운점:

1.  text.`split()`을 이용해서 한 줄에 있는 것들을 여러 개의 변수로 쪼갤 수 있다. 
2. `map(자료형,변수)` 을 이용해서 원하는 자료형으로 바꿀 수 있다.
3. 차 번호와 같은 고유 식별 번호를 인덱스로 이용할 수 있구나
4. 언패킹이라고 함`values = [10, 20, 30]; a, b, c = values` → 리스트 각각에 변수 할당 가능
5. 람다를 이용해서 정렬 기준을 정할 수 있음
