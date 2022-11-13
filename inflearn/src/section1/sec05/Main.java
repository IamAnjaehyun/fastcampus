package section1.sec05;

//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집 (특문은 그자리에 그대로)

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        //  if/else (특수문자임?) lt/rt ++/-- 하고 걍 뒤집어
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])) lt++; //알파벳이 아닐 때!
            else if(!Character.isAlphabetic(s[rt])) rt--; //알파벳이 아닐 때!
            else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}






