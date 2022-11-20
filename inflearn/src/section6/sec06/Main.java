package section6.sec06;
//장난꾸러기 ( 오름차순 정렬해놨는데 두놈이 자리바꿈 원래자리 어디인지? )

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> Solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); //깊은복사 ( tmp 복사해도 arr은 그대로 있게 하기 위함 )
        Arrays.sort(tmp);
        for(int i=0;i<n;i++){
            if(arr[i] != tmp[i]) answer.add(i+1); // 인덱스 번호가 다른애들을 answer에 넣음 정렬로 푸는게 쉬움!
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for(int x : Solution(n,arr)) System.out.print(x + " ");
    }
}
