package section4.sec02;
//길이 같은 두 단어 주어지고 알파벳 순서 재배치하면 같은 단어가 되는지? (아나그램)


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static String Solution(String a, String b){
        String answer="YES";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : a.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);// key의 value값 count
        }
        for(char x : b.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1); //하나씩 빼는거임
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(Solution(a,b));
    }
}

