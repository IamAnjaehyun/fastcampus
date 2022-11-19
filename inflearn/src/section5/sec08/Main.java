package section5.sec08;
//응급실
//응급도 높은사람 먼저 진료
//응급도 낮으면 맨뒤로 빼는데 나는 몇번째로 진료받을 수 있는가?
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Person{ //person 객체
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public static int Solution(int n,int m, int[] arr ){
        int answer=0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0;i<n;i++){
            Q.offer(new Person(i,arr[i]));
        }
        while (!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.add(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        System.out.println(Solution(n, m,a));
    }
}




