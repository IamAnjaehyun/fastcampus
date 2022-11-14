package section2.sec07;

import java.util.Scanner;

public class Main {
    public static int solution(int n, int[] arr) {
        int cnt = 0, answer = 0;
        for (int i = 0;i<n;i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            }else cnt=0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[] = new int[A];
        for (int i = 0; i < A; i++) arr[i] = sc.nextInt();
        System.out.println(solution(A, arr));

    }
}

