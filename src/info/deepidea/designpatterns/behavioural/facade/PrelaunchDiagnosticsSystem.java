package info.deepidea.designpatterns.behavioural.facade;

public class PrelaunchDiagnosticsSystem {
    private final AirBag airBag;
    private final Engine engine;
    private final CoolingSystem coolingSystem;

    public PrelaunchDiagnosticsSystem() {
        airBag = new AirBag();
        engine = new Engine();
        coolingSystem = new CoolingSystem();
    }

    public void start() {
        airBag.checkAirBag();
        engine.checkEngine();
        coolingSystem.checkCoolingSystem();
    }
}
