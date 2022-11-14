package section2.sec10;
//지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
//각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.

//십자중에 제일큰놈이 봉우리(같은 숫자가 있어도 안됨) 어려움 @_@;;
//좌표 움직이기

import java.util.Scanner;
public class Main {
    static int[] dx={-1,0,1,0}; //상하좌우 이동시킬때 쓰는 배열들
    static int[] dy={0,1,0,-1};
    public static int solution(int n , int[][] arr) {
        int answer = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean flag = true;
                for(int k=0;k<4;k++){ //상하좌우니까 4번만 돌려
                    int nx = i+dx[k]; //next x/y
                    int ny = j+dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny< n && arr[nx][ny]>=arr[i][j]){
                        // nx>=0 && nx<n && ny>=0 && ny< n 얘내가 테두리 생성해줌
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
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

