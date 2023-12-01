package program;

public class DeviceB implements Device{
    private static final int CONSTANTA = 2;

    @Override
    public double calculateResult(double param1, double param2) {
        return (param1 + param2) * CONSTANTA;
    }

    @Override
    public String toString() {
        return "DeviceB";
    }
}
