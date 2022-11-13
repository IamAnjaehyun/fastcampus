package section1.sec01;

import java.util.Scanner;

public class Main_Plus {
    public static int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char i : str.toCharArray()){
            if(i == c) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);

        System.out.println(solution(str,c));

    }
}



