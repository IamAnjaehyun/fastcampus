package section2.sec09;
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
//격자판 최대 합 (5개짜리)

import java.util.Scanner;

public class Main {
    public static int solution(int n, int[][] arr) {
        int answer= Integer.MIN_VALUE;
        int sum1,sum2; //1은 행의 합 X, 2는 열의 합 Y
        for(int i=0;i<n;i++){
            sum1 = sum2 = 0; //1은 행의 합 X, 2는 열의 합 Y
            for(int j=0;j<n;j++){
                sum1 += arr[i][j]; //행이 고정되고 열이 움직임 (X고정 Y0~5)
                sum2 += arr[j][i]; //행이 움직이고 열이 고정됨 (X0~5 Y고정)
            }
            answer = Math.max(answer, sum1); // answer로 지정된 값과 sum1로 지정된 값 둘 중 큰놈
            answer = Math.max(answer, sum2); // answer vs sum1 이긴놈과 sum2로 지정된 값 둘 중 큰놈
            //answer은 초기화 안시킴
        }
        sum1 = sum2 = 0; //1은 행의 합 X, 2는 열의 합 Y
        for(int i=0;i<n;i++){
            sum1 += arr[i][i]; // 대각선 (왼쪽위부터 오른쪽아래로 그어지는 대각)
            sum2 += arr[i][n-i-1]; // 대각선 (오른쪽 위부터 왼쪽 아래 그어지는 대각)
            answer = Math.max(answer, sum1); // 행 열에서 제일 큰놈 vs 대각선중에 제일 큰놈 다섯번 돌면서 비교 후 대입
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[][] = new int[A][A];
        for (int i = 0; i < A; i++)
            for (int j = 0; j < A; j++)
                arr[i][j] = sc.nextInt();
        System.out.println(solution(A, arr));

    }
}

