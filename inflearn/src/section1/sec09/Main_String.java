package section1.sec09;


import java.util.Scanner;

// 숫자와 문자가 섞여있는 문자열에서 숫자만 추출하고 그 순서대로 자연수 만들기
// 스트링으로 쭉쭉 더하기
public class Main_String {
    public static int solution(String str) {
        String answer = "";
        for(char x : str.toCharArray()){ //문자열 안에서 char 하나씩 돌기
            if(Character.isDigit(x)) answer+=x; //isDigit = 숫자인가 ?
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}


