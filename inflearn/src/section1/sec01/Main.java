package section1.sec01;

import java.util.Scanner;
//대소문자 구별 x 그냥 다 대문자로 바꿔버림
public class Main {
    public static int solution(String str, char c){
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
//        System.out.println(str + " " + c);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str =  sc.next();
        char ch = sc.next().charAt(0);

        System.out.println(solution(str,ch));
    }
}
