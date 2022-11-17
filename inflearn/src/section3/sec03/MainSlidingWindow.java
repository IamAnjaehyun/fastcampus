package section3.sec03;
//xx일간의 매출을 일별로 제시했을 때 x일간의 총 매출을 구하라(최대값)
//sliding window 슬라이딩 윈도우
//강사님 버전 ( 이게 더 시간복잡도 낮음)
import java.util.Scanner;

public class MainSlidingWindow {
    public static int solution(int n, int m, int[] a) {
        int answer = 0, sum=0;
        for(int i=0;i<m;i++) sum+= a[i];
        answer = sum;
        for(int i=m; i<n; i++){
            sum+=(a[i] - a[i-m]); //맨 앞에꺼 빼고 맨 뒤에꺼 더함
            answer = Math.max(answer,sum);
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

