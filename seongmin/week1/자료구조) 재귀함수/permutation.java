package Gwaje;

public class jaryo {
	
    private static void swap(char[] list, int i, int j) {
        char temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    public static void perm(char[] list, int i, int n) {
        if (i == n) {
            for (int j = 0; j <= n; j++) {
                System.out.print(list[j]);
            }
            System.out.println();
        } else {
            for (int j = i; j <= n; j++) {
                swap(list, i, j);
                perm(list, i + 1, n);
                swap(list, i, j);
            }
        }
    }

    public static void main(String[] args) {
        char[] list = {'1', '2', '3', '4'};
        perm(list, 0, list.length - 1);
    }
}

