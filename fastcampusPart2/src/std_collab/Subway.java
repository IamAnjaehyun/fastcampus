package std_collab;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int busNumber) {
        this.subwayNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayinfo() {
        System.out.println(subwayNumber + "번의 승객 수는 " + passengerCount + "이며 번 금액은 " + money + "입니다.");
    }
}
