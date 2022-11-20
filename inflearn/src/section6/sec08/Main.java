package section6.sec08;
//이분검색 알고리즘 ( 얘는 이분검색 아님 ) 그냥 정렬해서 찾은거

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int Solution(int n, int find,int[] arr) {
        int answer=0;
        int[] tmp = arr.clone(); //깊은복사 ( tmp 복사해도 arr은 그대로 있게 하기 위함 )
        Arrays.sort(tmp);
        for(int i=0;i<n;i++){
            if(find == tmp[i]) answer += i+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int find = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(Solution(n,find,arr));
    }
}
