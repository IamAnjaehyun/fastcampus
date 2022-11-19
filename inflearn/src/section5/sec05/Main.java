package section5.sec05;
//쇠막대기 절단
//괄호는 무조건 스택
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int Solution(String s){
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(') stack.push('(');
            else{
                stack.pop(); //닫는괄호면 일단꺼냄
                if(s.charAt(i-1)=='(') answer += stack.size();
                else answer ++; //막대기의 끝 아니면 더해줌
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}




