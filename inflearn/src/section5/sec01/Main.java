package section5.sec01;
//괄호 문자열 주어지고 올바른 괄호인지
//stack 사용하는 대표 문 (입구나 출구가 한곳) (구덩이구조 - 마지막에 들어간게 제일먼저 나감) last in first out(LIFO)
//괄호있으면 거의 stack 쓰는 문제임
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String Solution(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(x == '(') stack.push(x);
            else{
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO"; //여는 괄호가 많은 상황
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}


