# [level 2] 2 x n 타일링 - 12900 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12900?language=java) 

---

### 문제 설명

<p>가로 길이가 2이고 세로의 길이가 1인 직사각형모양의 타일이 있습니다. 이 직사각형 타일을 이용하여 세로의 길이가 2이고 가로의 길이가 n인 바닥을 가득 채우려고 합니다. 타일을 채울 때는 다음과 같이 2가지 방법이 있습니다.</p>

<ul>
<li>타일을 가로로 배치 하는 경우</li>
<li>타일을 세로로 배치 하는 경우</li>
</ul>

<p>예를들어서 n이 7인 직사각형은 다음과 같이 채울 수 있습니다.</p>

<p><img src="https://i.imgur.com/29ANX0f.png" title="" alt="Imgur"></p>

<p>직사각형의 가로의 길이 n이 매개변수로 주어질 때, 이 직사각형을 채우는 방법의 수를 return 하는 solution 함수를 완성해주세요.</p>

<h5>제한사항</h5>

<ul>
<li>가로의 길이 n은 60,000이하의 자연수 입니다.</li>
<li>경우의 수가 많아 질 수 있으므로, 경우의 수를 1,000,000,007으로 나눈 나머지를 return해주세요.</li>
</ul>

<hr>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>result</th>
</tr>
</thead>
        <tbody><tr>
<td>4</td>
<td>5</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>입출력 예 #1<br>
다음과 같이 5가지 방법이 있다.</p>

<p><img src="https://i.imgur.com/keiKrD3.png" title="" alt="Imgur"></p>

<p><img src="https://i.imgur.com/O9GdTE0.png" title="" alt="Imgur"></p>

<p><img src="https://i.imgur.com/IZBmc6M.png" title="" alt="Imgur"></p>

<p><img src="https://i.imgur.com/29LWVzK.png" title="" alt="Imgur"></p>

<p><img src="https://i.imgur.com/z64JbNf.png" title="" alt="Imgur"></p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges

---

### 아이디어
가로길이 2, 세로길이 1인 직사각형 존재.<br><br>

가로길이가 주어지면, 가로길이를 맞춰라.<br>
가로길이의 수만큼 직사각형이 주어질 것.<br><br>

n=1일 경우 : 1가지<br>
1. 세로로 배치하는 경우<br><br>

n=2일 경우 : 2가지<br>
1. 세로로 배치하는 경우<br>
2. 가로로 두개 놓기<br><br>

n=3일 경우 : 3가지<br>
1. 세로로 배치하는 경우<br>
2. 왼쪽에 세로타일 두고, 가로로 두개<br>
3. 오른쪽에 세로타일 두고, 가로로 두개<br><br>

n=4일 경우(예제) : 5가지<br>
1. 세로로 배치하는 경우<br>
2. 왼쪽에 세로, 중간에 가로두개, 오른쪽에 세로<br>
...<br><br>

=> 가장 오른쪽을 기준으로 했을 때, <br>
1. 오른쪽에 세로 하나를 놓는 경우 : 직사각형이 세개가 남는다? -> 3개를 배치하는 방법은 n=3에서 이미 구함
2. 오른쪽에 가로 두개를 놓는 경우 : 직사각형이 두 개가 남는다? -> 2개를 배치하는 방법은 n=2에서 이미 구함.

전에 구했던 방식을 또 사용한다. 그리고, 로직을 짜보면 "피보나치 수열" 공식이 나오는 것을 알 수 있다. <br><br>

결론적으로, 피보나치 수열 로직을 짜면 성공!
