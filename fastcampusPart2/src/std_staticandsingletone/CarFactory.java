package std_staticandsingletone;

public class CarFactory {
    private static CarFactory instace = new CarFactory();

    private CarFactory() {
    }

    public static CarFactory getInstance() {
        if (instace == null) instace = new CarFactory();
        return instace;
    }

    static Car createCar() {
        Car car = new Car();
        return car;
    }
}
