import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import static java.util.Collections.swap;

/*
재귀 순열
- 입력값 : a b c (띄어쓰기 필수)
- 출력값 :
abc
acb
bac
bca
cba
cab
*/

/*
+ 띄어쓰기 안 하고 abc로 입력할 경우, br.readLine으로 입력받아서 문자배열로 변환 후 list에 추가할 수 있도록 코드 수정하면 됨.
String input = br.readLine()
for(char c : input.toCharArray()) //input을 문자 배열로 변환한 후 char형 c에 하나씩 갖고오기
    list.add(String.valueOf(c)); //list는 String배열임. c를 String으로 변환하여 list에 add
나머지 코드는 동일!
*/
public class RecursionPerm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> list = new ArrayList<>(); int i = 0;
        //숫자 입력받아서 배열에 저장
        while(st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        //초기 호출
        perm(list, 0, list.size());
    }

    public static void perm(List<String> list, int i, int n) {
        //순열이 하나 완성됨
        if(i==n) {
            for(int j = 0; j<n; j++)
                System.out.print(list.get(j));
            System.out.println();

        }
        //순열 만들어주기
        else {
            for(int j = i; j <n; j++) {
                swap(list, i, j); //swap(대상 리스트, 첫 번째 교환 요소 인덱스, 두 번째 교환 요소 인덱스)
                perm(list, i+1, n);
                swap(list, i, j); //되돌리기
            }
        }
    }

}
