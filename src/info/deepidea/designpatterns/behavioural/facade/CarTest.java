package info.deepidea.designpatterns.behavioural.facade;

public class CarTest {
    public static void main(String[] args) {
        PrelaunchDiagnosticsSystem diagnosticsSystem = new PrelaunchDiagnosticsSystem();
        diagnosticsSystem.start();
    }
}
