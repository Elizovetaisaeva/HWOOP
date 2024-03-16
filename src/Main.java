import Strategy.service.Checkable;
import transport.*;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Stels");
        Car car = new Car("Mercedes");
        Truck truck = new Truck("Scania", 8);
        Bike bike = new Bike("Harley");
        MotorcycleWithTrailer motorcycleWithTrailer = new MotorcycleWithTrailer("Yamaha");

        Transport[] transports = new Transport[]{bicycle, car, truck, bike, motorcycleWithTrailer};

        Checkable.ServiceStation serviceStation = new Checkable.ServiceStation();
        serviceStation.check(transports[0]);
        serviceStation.check(transports);

    }
}







