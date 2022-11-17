package section4.sec01;
//학급 회장 뽑기 HashMap(key:value) key데이터형 char(abcd) / value데이터형 int(카운팅 해야됨)
//가장 표 많이 받은 사람 당선

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static char Solution(int n, String s){
        char answer=' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){ //x가 a가됐다 b가됐다 c가됐다 ...
            map.put(x,map.getOrDefault(x,0)+1); //getOrDefault(x가 있다면 x의 키값, x의 키값이 없으면 0을 가져옴) +1은 기본 키값에 1씩 더하는겨
        }//키를 알파벳 갯수만큼 계산하는 for 문
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
//            System.out.println(x+" : "+map.get(x)); // key = x / map.get(x) = x의 value
            if(map.get(key)>max){
                max = map.get(key);
                answer = key;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str = sc.next();
        System.out.println(Solution(n,str));
    }
}

