package section5.sec07;
//교육과정 설계
// abc 면 abdddddc 여도 참

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static String Solution(String need, String plan){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : need.toCharArray()) Q.offer(x);
        for(char x : plan.toCharArray()){
            if(Q.contains(x)){
                if(x != Q.poll()) return "NO"; //꺼내고 리턴받음
            }
        }
        if(!Q.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String need = sc.next(); //필수 과목의 순서
        String plan = sc.next(); //짠 계획
        System.out.println(Solution(need, plan));
    }
}




