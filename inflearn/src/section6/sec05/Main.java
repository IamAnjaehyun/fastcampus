package section6.sec05;

import java.util.Arrays;
import java.util.Scanner;

//중복 확인 + 정렬 사용해서 ( hashmap보다는 성능 떨어짐 )
public class Main {
    public static String Solution(int n, int[] arr){
        String answer = "U";
        Arrays.sort(arr); // 배열 정렬 오름차순
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1]) return "D";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(Solution(n,arr));
    }
}
