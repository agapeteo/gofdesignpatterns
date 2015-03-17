package info.deepidea.designpatterns.structural.bridge;

public class BicycleTire extends Tire {
    private final int size;

    public BicycleTire(int size, TireMaker maker) {
        super(maker);
        this.size = size;
    }

    public void create() {
        createTire(size);
    }
}
