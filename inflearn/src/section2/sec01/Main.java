package section2.sec01;
// 정수 A를 입력받고 정수 n개 입력받아서 자신의 바로 앞 수보다 큰 수 만 한줄로 출력

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) answer.add(arr[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[] = new int[A];
        for (int i = 0; i < A; i++) arr[i] = sc.nextInt();
        for (int x : solution(A, arr)) {
            System.out.print(x + " ");
        }
    }
}


