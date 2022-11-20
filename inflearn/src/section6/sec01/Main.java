package section6.sec01;
//선택 정렬 문제 오름차순으로 정렬
//6
//13 5 11 7 23 15

import java.util.Scanner;

public class Main {
    public static int[] Solution(int n, int[] arr) {
        int temp;
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : Solution(n, arr)) System.out.print(x + " ");
    }
}




