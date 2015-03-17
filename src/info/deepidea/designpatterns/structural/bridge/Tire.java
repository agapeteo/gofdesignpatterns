package info.deepidea.designpatterns.structural.bridge;

public abstract class Tire {
    private final TireMaker maker;

    public Tire(TireMaker maker) {
        this.maker = maker;
    }

    public void createTire(int size) {
        maker.makeTire(size);
    }
}
