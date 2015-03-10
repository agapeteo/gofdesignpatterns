package info.deepidea.designpatterns.structural.facade;

public class CarTest {
    public static void main(String[] args) {
        PrelaunchDiagnosticsSystem diagnosticsSystem = new PrelaunchDiagnosticsSystem();
        diagnosticsSystem.start();
    }
}
