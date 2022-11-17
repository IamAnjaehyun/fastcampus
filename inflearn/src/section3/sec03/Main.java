package section3.sec03;
//xx일간의 매출을 일별로 제시했을 때 x일간의 총 매출을 구하라(최대값)
//sliding window 슬라이딩 윈도우

import java.util.Scanner;

public class Main {
    public static int solution(int n, int m, int[] a) {
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += a[j];
            }
            answer = Math.max(sum, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.println(solution(n, m, a));
    }
}

