// DFS: 깊이 우선 탐색으로 깊은 노드를 먼저 탐색하는 알고리즘이다. 최근에 방문한 노드가 새로운 노드와 연결되어 있으면
// 해당 노드로 이동한다.
// BFS: 너비 우선 탐색으로 얕은 노드를 먼저 탐색하는 알고리즘입니다. 최근에 방문한 노드와는 별개로 본인과 연결된 노드를
// 순차적으로 방문한다.


import java.util.*;

class TreeNode {
    int value;
    TreeNode left, right;
    
    public TreeNode(int value) {
        this.value = val;
        this.left = this.right = null;
    }
}

public class TreeTraversal {
    
    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.value + " ");
        inorderTraversal(root.right);
    }

    public class TreeTraversal {

    public static void levelOrderTraversal(TreeNode root) {
        int height = getHeight(root);
        for (int i = 1; i <= height; i++) {
            printLevel(root, i);
        }
    }

    public static int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void printLevel(TreeNode root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.value + " ");
        } else {
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }
}
}
