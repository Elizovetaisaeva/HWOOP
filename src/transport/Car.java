package transport;

public class Car extends Transport {
    public static final Integer WHEELS = 4;
    public void checkEngine() {
        System.out.println("Проверяем двиготиль");
    }
    public Car(String modelName) {
        super(modelName, WHEELS);
    }
}
