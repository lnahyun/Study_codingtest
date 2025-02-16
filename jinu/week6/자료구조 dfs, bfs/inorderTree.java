import java.util.*;

class Node{
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class inorderTree {
    Node root;

    public void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args){
        inorderTree tree = new inorderTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        System.out.print("중위순회 결과: ");
        tree.inorder(tree.root);
    }
}

/*

DFS = Depth First Search (깊이 우선 탐색)
말그대로 Depth에 대해 먼저 탐색한 후 끝 지점에 도달했을시에 방문하지 않은 vertex에 대해 다시 돌아오는 동작 방식을 가진 알고리즘.
한 경로의 시작과 끝을 탐색하고 다음 경로를 찾는 방식이기 때문에 모든 경로 탐색 (경우의 수 찾기)에 유리하다.
따라서 재귀나 후입선출 방식인 스택 구조에 어울린다.

BFS = Breadth First Search (너비 우선 탐색)
출발 vertex에 인접한 vertex 부터 방문하여 점점 멀리있는 vertex에 방문하는 알고리즘.
출발 vertex를 기준으로 가까운 vertex들 부터 탐색하기 때문에 최단 경로 탐색에 유리하다.
따라서 선입선출 방식인 큐 구조에 어울린다.

*/