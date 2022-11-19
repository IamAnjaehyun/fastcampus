package section5.sec02;
//문자열 주어지고 괄호 안에 있는 글자 빼고 출력
//여는괄호 넣고 닫는괄호 나오면 닫는괄호 버리기?
// 입력 (A(BC)D)EF(G(H)(IJ)K)LM(N)
// 출력 EFLM
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static String Solution(String s){
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : s.toCharArray()) {
            if(x==')'){
                while(stack.pop() != '('); //꺼낸값도 리턴받으니 유의! 여는괄호 꺼내고 멈춤!
            }
            else stack.push(x);
        }
        for(int i=0;i<stack.size();i++) answer += stack.get(i); //size는 크기
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}



