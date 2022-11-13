package section1.sec02;

import java.util.Scanner;
//아스키 소문자 - 32 = 대문자
//아스키 대문자 + 32 = 소문자

//소문자는 대문자로 출력/ 대문자는 소문자로 출력

public class Main {
    public static String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
            if(Character.isUpperCase(x)) answer+=Character.toLowerCase(x);
            //else answer += Character.toLowerCase(x);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));
    }
}

