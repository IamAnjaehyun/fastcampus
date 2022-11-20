package section6.sec04;
//삽입정렬
//2중for문인데 i는 1번인덱스부터 j는 0번 인덱스부터

import java.util.Scanner;

public class Main {
    public static int[] Solution(int size, int n, int[] arr) {
        int[] cache = new int[size];
        for (int x : arr) {
            int pos = -1; //인덱스번호 (위치)
            for (int i = 0; i < size; i++) if (x == cache[i]) pos = i; //히트상황
            if (pos == -1) { //미스상황
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : Solution(size, n, arr)) System.out.print(x + " ");
    }
}
