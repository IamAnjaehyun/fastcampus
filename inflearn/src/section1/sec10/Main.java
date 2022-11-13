package section1.sec10;

import java.util.Scanner;
//teachermode e
//첫번째 단어에서 각자랑 e 랑 얼마나 먼지?
//왼쪽e 부터 + 오른쪽e 부터 각 알파벳 거리 for문 두번 돌리고 둘 중 작은 숫자로

public class Main {
    public static int[] solution(String str, char c) {
        int[] answer = new int[str.length()];
        int p = 1000;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }
        p = 1000;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == c) p = 0; //위에서 이미 p를 배열 안에 넣어줬으니까 answer[i] = p 는 할 필요가 없
            else {
                p++;
                answer[i] =Math.min(answer[i], p); //위에서 한거 값은 이미 들어가있으니 그거랑 새로 한거랑 비교
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : solution(str, c)) {
            System.out.print(x + " ");
        }
//        System.out.println(solution(str,c)+" ");
    }
}


