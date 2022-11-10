package algorithm.greedy;

public class GreedyTest {
    public static void main(String[] args) {
        int[] coins = {500,100,50,10};
        int price = 8370;
        int count;

        for(int i=0;i< coins.length;i++){
            count = 0;
            count += price/coins[i]; // coints[i]
            price %= coins[i]; // 가격을 코인의 최대치로 나누고 남은 금액이 price에 들어감

            System.out.println(coins[i] +"원 동전 " + count +" 개");
        }
    }
}
