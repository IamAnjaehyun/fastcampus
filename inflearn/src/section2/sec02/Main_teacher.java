package section2.sec02;
//키로 줄세우기 먼저나온 숫자가 더 크면 뒤에는 안보임 ( 더 큰 뒷놈 나오면 보임 )

import java.util.Scanner;

public class Main_teacher {
    public static int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[] = new int[A];
        for (int i = 0; i < A; i++) arr[i] = sc.nextInt();
        System.out.println(solution(A,arr));
    }
}

