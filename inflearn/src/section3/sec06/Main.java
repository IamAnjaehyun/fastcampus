package section3.sec06;
// 최대 길이 연속부분수열
// 0과 1로 주어진 수열에서 0을 1로 k번 바꿀 수 있음
// 1로만 된 부분수열 최대 길이 찾기
// 0101010 -> 3번 주어짐 -> 111111 = 길이6
// rt가 가르키는 곳이 0이면 1로 바꾸는걸로 알아야함 cnt값에 몇번 바꿨는지 계산
// rt-lt+1 이게 길이
import java.util.Scanner;

public class Main {
    public static int Solution(int n, int m, int arr[]) {
        int answer = 0, cnt=0, lt=0;

        for(int rt = 0; rt < n ; rt++){
            if(arr[rt] == 0) cnt++;
            while(cnt>m){
                if(arr[lt]==0) cnt--; //lt를 0에서 1로 바꾼 지점 + cnt가 m 을 초과했으니 바꿔줘야댐
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution(n, m, arr));
    }
}

