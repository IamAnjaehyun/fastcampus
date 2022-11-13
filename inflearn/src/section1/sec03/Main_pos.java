package section1.sec03;

import java.util.Scanner;

//문장 속에서 가장 긴 단어 찾기
public class Main_pos {
    public static String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1); //여기까지만 하면 마지막 단어 뒤에 띄어쓰기 없어서 안댐
            if(str.length()>m) answer = str;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}


