package section2.sec11;
//임시 반장 정하기
//6학년 때 까지 애들이랑 같은반 제일 많이 해본 애 우승 (표는 몇반이였는지(배열은))
//5
//2 3 1 7 3
//4 1 9 6 8
//5 5 2 4 4
//6 5 2 6 7
//8 4 2 2 2

import java.util.Scanner;

public class Main {
    public static int solution(int n, int[][] arr) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0; // i번째 학생이 같은반 된 학생의 수
            for (int j = 1; j <= 5; j++) { //j번째 애들과 비교
                for(int k=1;k<=5;k++){ //k는 학년
                    if(arr[i][k] == arr[j][k]){
                        cnt++; //한명이랑 두번되는건 없음
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[][] = new int[A + 1][6];
        for (int i = 1; i <= 5; i++)
            for (int j = 1; j <= 5; j++)
                arr[i][j] = sc.nextInt();
        System.out.println(solution(A, arr));

    }
}

