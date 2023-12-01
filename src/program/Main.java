package program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter param1: ");
        double param1 = scanner.nextDouble();

        System.out.print("Enter param2: ");
        double param2 = scanner.nextDouble();

        Device deviceA = new DeviceA();
        Device deviceB = new DeviceB();

        double resultA = deviceA.calculateResult(param1, param2);
        double resultB = deviceB.calculateResult(param1, param2);

        System.out.printf(deviceA + " result: %.2f%n", resultA);
        System.out.printf(deviceB + " result: %.2f", resultB);

        scanner.close();
    }
}
