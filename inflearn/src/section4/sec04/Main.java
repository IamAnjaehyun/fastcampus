package section4.sec04;
//모든 아나그램 찾기
//슬라이딩 윈도우로 아나그램 찾기. 대소문자 구분


import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static int Solution(String a, String b){
        int answer = 0;
        HashMap<Character,Integer> bmap = new HashMap<>();
        HashMap<Character,Integer> amap = new HashMap<>();
        for(char x : b.toCharArray()) bmap.put(x,bmap.getOrDefault(x,0)+1);// 짧은 기준 미리 만듬
        int L = b.length()-1;
        for(int i=0;i<L;i++) amap.put(a.charAt(i),amap.getOrDefault(a.charAt(i),0)+1);//1개 빼고 세팅해두기 이방식도 중요
        //이제 투포인트 알고리즘 돌면 됨
        int lt=0;
        for(int rt=L;rt<a.length();rt++){
            amap.put(a.charAt(rt), amap.getOrDefault(a.charAt(rt),0)+1); //여기서 rt번째를 하나 더해서 amap이 길이가 3짜리 hashmap이 됐음
            if(amap.equals(bmap)) answer++; // amap bmap 같으면 answer ++
            amap.put(a.charAt(lt), amap.get(a.charAt(lt))-1); //왼쪽꺼 하나씩 줄인다.
            if(amap.get(a.charAt(lt)) == 0) amap.remove(a.charAt(lt)); // value 값이 0이면 삭제
            lt++; //lt쫓아감 rt는 for 문제서 증가
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

