package section1.sec03;

import java.util.Scanner;
//문장 속에서 가장 긴 단어 찾기
public class Main {
    public static String solution(String str) {
        String answer = "";
        int m=Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for(String x : s){
            int len = x.length();
            if(len>m){
                m=len;
                answer=x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}


