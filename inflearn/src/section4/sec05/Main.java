package section4.sec05;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// 배열 주어지고 무조건 3개 뽑는 모든 경우의 수 중에 n번째로 큰 수 추출
// ex) 25 25 23 23 22 면 3번째 큰 값이 22
// set 자료구조는 중복제거 자료구조
// treeset = 자동정렬까지 내림차순이나 오름차순 정렬가능
public class Main {
    public static int Solution(int n, int m, int[] arr) {
        int answer=-1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); //기본적으로 오름차순 //Collections.reverseOrder 있으면 내림차순
        //무조건 3장이라 했으니 무조건 3중for문
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { //i가 뽑은거 다음부터 뽑아야지 i가뽑았는데 j가 또뽑으면 안돼
                for (int k = j + 1; k < n; k++) { //for 문에서 어차피 초과되면 끝나니까 셋 다 n까지 돌려도 ㄱㅊ
                    Tset.add(arr[i] + arr[j] + arr[k]); //중복제거 내림차순으로 들어감 reverseOrder 썼으니께~~
                }
            }
        }
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt == m) return x;
//            System.out.println(cnt + " = "+ x);
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
