package section5.sec04;
//후위식 연산
// 숫자면 스택에 넣고 계산기호 나오면 두개빼서 늦게나온거 - 먼저나온거
// 352+*9- = 12
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int Solution(String s){
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) stack.push(x-48);//isDigit == 숫자인지 판별 -48 해야 실제 숫자가 됨
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+') stack.push(lt+rt); //왼쪽에서 오른쪽으로 계산 중요!!
                else if(x == '-') stack.push(lt-rt);
                else if(x == '*') stack.push(lt*rt);
                else if(x == '/') stack.push(lt/rt);
            }
        }
        answer = stack.get(0); //마지막 남은거 가져옴
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}




