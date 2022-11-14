package section2.sec04;

import java.util.Scanner;

public class Main {
    public static void solution(int n) {
        int a1 = 1, a2=1, a3;
        System.out.print(a1 + " " + a2 + " ");
        for (int i = 2; i < n; i++) {
            a3 = a1 + a2;
            System.out.print(a3 + " ");
            a1 = a2;
            a2 = a3;
        }
    }
    //배열 버전
//        int answer[] = new int[n];
//        answer[0] = 1;
//        answer[1] = 1;
//        for(int i=2;i<n;i++){
//            answer[i] = answer[i-1]+answer[i-2];
//        }
//        return answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}

