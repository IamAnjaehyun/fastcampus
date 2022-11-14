package section2.sec03;
//가위바위보 1가위 2바위 3보 승자 출력 비기면 D 출력

import java.util.Scanner;

public class Main {
    public static String solution(int n , int[] arrA, int[] arrB) {
        String answer = "";
        for(int i=0;i<n;i++){
            if(arrA[i] == arrB[i]) answer += 'D';
            else if(arrA[i] == 1 && arrB[i] == 3) answer += 'A';
            else if(arrA[i] == 2 && arrB[i] == 1) answer += 'A';
            else if(arrA[i] == 3 && arrB[i] == 2) answer += 'A';
            else answer += 'B';
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrA[] = new int[n];
        int arrB[] = new int[n];
        for(int i=0;i<n;i++) arrA[i] = sc.nextInt();
        for(int i=0;i<n;i++) arrB[i] = sc.nextInt();
        for(char x : solution(n,arrA,arrB).toCharArray()) System.out.println(x);;

    }
}

