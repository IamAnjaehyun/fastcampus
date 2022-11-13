package section1.sec07;

import java.util.*;
//회문 문자열 대소문자 구분 x /  ex)토마토 기러기 인도인 스위스 우영우
public class Main {
    public static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase(); //대소문자 구분 하지 않기 위해 대문자로 올려버려
        int len = str.length();
        for(int i=0;i<len/2; i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}


