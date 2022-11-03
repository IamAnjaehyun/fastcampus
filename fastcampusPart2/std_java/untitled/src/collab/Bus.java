package std_collab;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber){
        this.busNumber = busNumber;
    }

    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    public void showBusinfo(){
        System.out.println(busNumber + "번의 승객 수는 "+passengerCount+"이며 번 금액은 "+money+"입니다.");
    }
}
