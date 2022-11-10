package algorithm.bruteforcesearch;

public class BruteForceSearch { //경우의 수 문제
    //1,2,5,10,20,50 으로 100을 만드는 가짓수
    public static void main(String[] args) {
        int[] bills = {1, 2, 5, 10, 20, 50};

        int count = 0;
        int money = 100;
        int i0, i1, i2, i3, i4;

        for (i0 = money; i0 >= 0; i0 -= bills[0])
            for (i1 = money; i1 >= 0; i1 -= bills[1])
                for (i2 = money; i2 >= 0; i2 -= bills[2])
                    for (i3 = money; i3 >= 0; i3 -= bills[3])
                        for (i4 = money; i4 >= 0; i4 -= bills[4])
                            if (i4 % bills[5] == 0) count++;
        System.out.println(count + " 개의 가짓수 ");
    }

}
