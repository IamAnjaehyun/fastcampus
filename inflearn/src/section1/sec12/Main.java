package section1.sec12;
//암호를 2진수화로 변환 -> 변환 후에 10진수로 변환 -> 그 후에 아스키문자로 변환
import java.util.Scanner;
public class Main {
    public static String solution(int n, String str) {
        String answer = ""; //암호 풀어서 answer에 삽입
        for(int i=0; i<n;i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
//            System.out.println(tmp+" "+num); // 2진수 + 2진수를 10진수로

//            System.out.println(tmp+" "+(char)num); // 10진수로 변환한 값을 char 값으로 형변환

            answer += (char)num;

            str = str.substring(7);

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n,str));
    }
}


