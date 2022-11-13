package section1.sec09;


import java.util.Scanner;
// 숫자와 문자가 섞여있는 문자열에서 숫자만 추출하고 그 순서대로 자연수 만들기
// 아스키 넘버 정리해놓자
public class Main {
    public static int solution(String str) {
        int answer = 0;
        for(char x : str.toCharArray()){ //문자열 안에서 char 하나씩 돌기
            if(x>=48 && x<=57) answer = answer * 10 +(x-48); // ascii가 범위 안에 있으면 (숫자 범위면) answer 한칸씩 땡기고 뒤에 숫자로 변환해서 삽입
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}


