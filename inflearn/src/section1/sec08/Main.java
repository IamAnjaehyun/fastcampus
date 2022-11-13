package section1.sec08;

import java.util.Scanner;
//알파벳만 회문검사
public class Main {
    public static String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");//대문자 알파벳이 아니면(^ = 아니면) , 빈문자 로 정규식을 사용해서 변환
        String tmp = new StringBuilder(str).reverse().toString(); // 뒤집기
        if(str.equals(tmp)) answer="YES"; //뒤집은거랑 기존이랑 같으면 answer = "YES"

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}


