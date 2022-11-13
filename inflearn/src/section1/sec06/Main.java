package section1.sec06;

//중복된 알파벳은 제외하고 출력하기
import java.util.Scanner;
public class Main {
    public static String solution(String str) {
        String answer = "";
        for(int i=0;i<str.length();i++){
            //중복문자를 직관적으로 출력해서 자신의 위치와 처음발견된 인덱스오브 번호가 같으면 처음 나온녀석
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));

            // str.indexOf(str.charAt(i)) == i 면 처음나온 알파벳
            if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}


