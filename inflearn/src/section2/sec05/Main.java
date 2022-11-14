package section2.sec05;
//소수 개수 출력 ( 1부터 N까지 숫자중 소수)
//에라토스테네스 체 (*중요*)
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static int solution(int n) {
        int answer = 0;
        int[] ch = new int[n+1];
        for(int i=2; i<n; i++){
            if(ch[i] == 0){
                answer++;
                for(int j=i;j<n;j=j+i) ch[j] = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        System.out.println(solution(A));

    }
}

