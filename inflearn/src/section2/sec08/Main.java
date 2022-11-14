package section2.sec08;

import java.util.ArrayList;
import java.util.Scanner;
//배열 안에서 등수 매기기
public class Main {
    public static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) cnt++; //반복문 두번돌려서 한세트에 한놈씩 등수 정해서 1등부터 매기는게 아니고 첫번째놈 4등 둘째놈 1등 ... 이런식으로
            }
            answer.add(cnt);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int arr[] = new int[A];
        for (int i = 0; i < A; i++) arr[i] = sc.nextInt();
        for (int x : solution(A, arr)) System.out.print(x + " ");
    }
}

