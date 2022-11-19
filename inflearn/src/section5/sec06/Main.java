package section5.sec06;
// 공주 구하기 queue 스택의 반대
// Queue에 집어넣는건 xx.offer(x) //뺄 때문 xx.poll(x) first in first out (FIFO) 먼저들어간게 먼저나옴
// peek 는 확인만 / size는 몇개가 있는지? / xx.contains(x) 있으면 참 없으면 거짓
// 앞에서 빼서 뒤에가 넣음 poll해서 빼고 offer 해서 넣음 그리고 n번째꺼는 그냥 poll

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int Solution(int n, int m){
        int answer=0;
        Queue<Integer> Q = new LinkedList<>();
        for(int i=1;i<=n;i++) Q.offer(i);
        while(!Q.isEmpty()){ //비어있으면 참이 되니까 ! 붙이기
            for(int i=1;i<m;i++) Q.offer(Q.poll());
            Q.poll();
            if(Q.size() == 1) answer = Q.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Solution(n,m));
    }
}




