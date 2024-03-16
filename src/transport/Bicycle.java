package transport;

public class Bicycle extends Transport {
    private static final Integer WHEELS = 2;
    public Bicycle (String modelName) {
        super(modelName,WHEELS);
    }
}
