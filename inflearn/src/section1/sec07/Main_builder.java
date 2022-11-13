package section1.sec07;


import java.util.*;
// 토마토 인도인 스윙스 별똥별 우영우
public class Main_builder {
    public static String solution(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer = "NO"; //equalsIgnoreCase 는 대소문자 구별 안함
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
