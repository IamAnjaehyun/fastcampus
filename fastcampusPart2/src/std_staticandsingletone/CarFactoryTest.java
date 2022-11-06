package std_staticandsingletone;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstance();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println("1번마 " + mySonata.getCarNum());
        System.out.println("2번마 " + yourSonata.getCarNum());
    }
}
