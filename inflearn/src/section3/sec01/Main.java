package section3.sec01;
//두 배열 합치기 + 오름차순 정렬
//two pointers algorithm
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]); //arr1[p1] 이 되고 난 뒤에 arr1[p1+1] 이 들어감
            else answer.add(arr2[p2++]);
        }
        while(p1<n) answer.add(arr1[p1++]);
        while(p2<m) answer.add(arr2[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        int m = sc.nextInt();
        int arr2[] = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        for(int x : solution(n,m,arr1,arr2)) System.out.print(x + " ");

    }
}
