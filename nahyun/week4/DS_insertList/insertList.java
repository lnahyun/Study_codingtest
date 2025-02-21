import java.util.Iterator;
import java.util.*;

/*
    java의 LinkedList사용
    ArrayList로도 삽입할 수 있으나, 중간에 삽입할 경우 뒷 요소들이 한 칸씩 밀려남 -> O(n)
    + ListIterator 사용 : 단순히 LinkedList만 사용한다면 인덱스를 찾는데 O(n)이 걸림. iterator를 사용하여 인덱스로 이동
*/
public class insertList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 4, 5));

        ListIterator<Integer> it = list.listIterator(2);
        it.add(3);

        System.out.println(list);
    }
}
