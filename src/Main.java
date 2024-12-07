public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        Car car = new Car("carFirst", 4);
        Car car2 = new Car("carSecond", 2);

        Truck truck = new Truck("truckFirst", 6);
        Truck truck2 = new Truck("truckSecond", 8);

        Bicycle bicycle = new Bicycle("bicycleFirst", 2);
        Bicycle bicycle2 = new Bicycle("bicycleSecond", 2);

        station.check(car, bicycle, truck);
        station.check(car2, bicycle2, truck2);

    }
}