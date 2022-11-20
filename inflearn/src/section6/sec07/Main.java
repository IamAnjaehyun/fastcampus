package section6.sec07;
//좌표 정렬

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point>{ //좌표정렬할때 Point 클래스 implement Comparable 써서 !!
    public int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) {return this.y-o.y;}
        //this 객체가 앞에 있고 o가 뒤에있다고 생각 this - o 이렇게 정렬되려면 this(10)-o(20) 해서 음수가 나오게 해야 오름차순이 됨 아무튼 음수값이 되게 해라?..
        else {return this.x-o.x;}
        //내림차순이면 this가 크고 o가 작은거 o.y-this.y 해야함
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " "+ o.y);
    }
}
