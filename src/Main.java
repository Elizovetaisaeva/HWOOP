import java.security.Provider;

public class Main {
    public static void main(String[] args) {

        Car car = new Car (modelName "car1", wheelsCount 4);
        Car car2 = new Car (modelName "car2", wheelsCount 4);

        Truck truck = new Truck (modelName "truck1", wheelsCount 6);
        Truck truck2 = new Truck (modelName "truck2", wheelsCount 8);

       Bicycle bicycle = new Bicycle (modelName "bicycle", wheelsCount 2);
       Bicycle bicycle2 = new Bicycle (modelName "bicycle2", wheelsCount 2);


       ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);


    }
}