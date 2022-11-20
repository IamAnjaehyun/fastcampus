package section6.sec03;
//삽입정렬
//2중for문인데 i는 1번인덱스부터 j는 0번 인덱스부터
import java.util.Scanner;

public class Main {
    public static int[] Solution(int n, int[] arr){
        for(int i=1;i<n;i++){
            int temp=arr[i],j;

            for(j=i-1;j>=0;j--){ //여기가 중요
                if(arr[j] > temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int x : Solution(n,arr)) System.out.print(x + " ");
    }
}
