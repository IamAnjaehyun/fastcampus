package section6.sec08;
//이분검색 알고리즘

import java.util.Arrays;
import java.util.Scanner;

public class MainTeacher {
    public static int Solution(int n, int find,int[] arr) {
        int answer=0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(arr[mid] == find){
                answer = mid+1;
                break;
            }
            if(arr[mid]>find) rt=mid-1;
            else lt = mid+1;
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
