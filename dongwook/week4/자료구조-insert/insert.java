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
