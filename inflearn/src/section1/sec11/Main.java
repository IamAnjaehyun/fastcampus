package section1.sec11;
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//단 1이면 생략

import java.util.Scanner;

public class Main {
    public static String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt = 1;
        for(int i=0; i< str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else{
                answer += str.charAt(i);        //여기 else 문이 중요
                if(cnt>1) answer += String.valueOf(cnt);
                cnt=1;
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


