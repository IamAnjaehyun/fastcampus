package section3.sec05;
//양의 정수 n을 입력하면 2개 이상 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수 출력
//연속 부분수열 sec04 심화버전

import java.util.Scanner;

public class Main {
    public static int Solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1; //배열에 0부터 m까지 넣기
        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];//뒤에꺼 증가
            if(sum == n) answer++;
            while(sum >= n){
                sum -= arr[lt++]; //앞에꺼 하나 빼고 증가
                if(sum == n) answer ++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Solution(n));
    }
}
