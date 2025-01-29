### [java] 특정 인덱스에 값 삽입
java의 LinkedList사용 <br>
ArrayList로도 삽입할 수 있으나, 중간에 삽입할 경우 뒷 요소들이 한 칸씩 밀려남 -> O(n)
+ ListIterator 사용 : 단순히 LinkedList만 사용한다면 인덱스를 찾는데 O(n)이 걸림. iterator를 사용하여 인덱스로 이동

---

**1. 오류코드**
```java
int[] arr = {1, 2, 4, 5};
LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
```
: int[]배열 자체를 하나의 객체로 감싸서 리스트 단일 요소로 취급. 결국 List안에는 배열 자체가 들어가있는 것. <br>
(list.size() 의 출력값은 **1** 이 됨)

**2. 정상 코드1**
```java
Integer[] arr = {1, 2, 4, 5};
LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
```
: Integer[]을 Arrays.asList()에 전달하면, List<Integer>로 변환됨. **객체 배열**

**3. 정상 코드2**
```java
LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 4, 5));
```
: Arrays.asList()가 1, 2, 4, 5를 각각 Integer로 받아서 List<Integer>를 만들고, 이를 LinkedList<Integer>에 넣음

#### 결론
int[]이 아닌 Integer[] 또는 Integer 값을 직접 넣어야 List<Integer>로 변환됨
