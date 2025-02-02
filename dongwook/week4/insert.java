package Study_codingtest.dongwook.week4;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node first;

    public LinkedList() {
        this.first = null;
    }

    // insert 메서드를 LinkedList 클래스의 멤버 메서드로 이동
    public void insert(Node x) {
        Node temp = new Node(50);

        if (first != null) {
            temp.next = x.next;
            x.next = temp;
        } else {
            temp.next = null;
            first = temp;
        }
    }
}
