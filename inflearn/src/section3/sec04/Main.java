package section3.sec04;
//배열이 주어지고 그 안에 수를 더해 원하는 값이 나오면 cnt ++ 해서 총 갯수 도출
//1 2 3 더하고 비교 -> 1빼고 4더하고 비교 -> 원하는 값이 아니면 더하기만 하고 비교-> 2빼고 5더하고 비교 -> 초과하면 빼기만 하고 비교 ->
import java.util.Scanner;

public class Main {
    public static int solution(int n, int m, int[] a) {
        int answer = 0, sum = 0, lt=0;
        for(int rt=0; rt<n; rt++){
            sum+=a[rt];
            if(sum==m)answer++; //증가하고 더하고 확인
            while(sum>=m) {
                sum -= a[lt++];
                if (sum == m) answer++; //합보다 크면 왼쪽배열 빼야함
            }
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

