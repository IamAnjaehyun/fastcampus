package section1.sec04;

// N개의 단어가 들어오면 뒤집어서 출력

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> solution(String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(String x : solution(str)){
            System.out.println(x);
        }
    }
}


