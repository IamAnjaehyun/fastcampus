package section4.sec03;
//매출액의 종류 연속된 k일간 10 20 10 40 에 3개면 2개(10,20) 3개(20,10,40)
//Hash + SlidingWindow
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> Solution(int n, int m, int[] a){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        //value 값이 0이되면 value가 0이 된 key값을 같이 삭제해줘야함!!! 지우고나서 lt 증 한번 할때마다 hashmap.size() 를 answer에 add 해줘야댐
        for(int i=0; i<m-1 ; i++){//하나 전까지 미리 세팅
            hashMap.put(a[i],hashMap.getOrDefault(a[i],0)+1);
        }
        int lt=0;
        for(int rt=m-1;rt<n;rt++){
            hashMap.put(a[rt],hashMap.getOrDefault(a[rt],0)+1);
            answer.add(hashMap.size());
            hashMap.put(a[lt],hashMap.get(a[lt])-1); //lt키값은 당연히 키가 있으니까 get만 해도됨 lt하나 빼는거임
            if(hashMap.get(a[lt]) == 0) hashMap.remove(a[lt]); // value 0됐으면 삭제
            lt++;//그다음에 ++
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int x : Solution(n,m,a)) System.out.print(x + " ");
    }
}


