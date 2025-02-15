//노드 생성
class Node<E> {
    E item;
    Node<E> next;

    public Node(E element, Node<E> next) {
        this.item = element;
        this.next = next;
    }
}
// 연결 리스트
class LinkedList<E> {
    private Node<E> head;

    public void add(E element) {
        Node<E> newNode = new Node<>(element, null);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAfter(E target, E newItem) {
        Node<E> ptr, temp;
        temp = new Node<>(newItem, null);

        // target 값 가진 노드 찾았을 때
        for (ptr = head; ptr != null && !ptr.item.equals(target); ptr = ptr.next);

        if (ptr == null) {
            System.out.println(target + "이 존재하지않음");
            return;
        }

        temp.next = ptr.next;
        ptr.next = temp;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.item + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// 결과가 제대로 나오는 지 출력하는 코드
// public class Main {
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<>();

//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);

//         list.printList(); // 원래 리스트

//         list.insertAfter(3, 5); // 3뒤에 5 삽입
//         list.printList(); // 삽입 후 리스트
//     }
// }
