import java.util.Scanner;

public class HydrostaticPressureCalculator {
    /**membuat class menghitung*/
    public static double calculateHydrostaticPressure(double density, double depth) {
        double gravity = 9.81;
        double pressure = density * gravity * depth;
        return pressure;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kerapatan air (kg/m^3): ");
        double waterDensity = scanner.nextDouble();
        System.out.print("Masukkan kedalaman dalam air (meter): ");
        double depth = scanner.nextDouble();
        double pressure = calculateHydrostaticPressure(waterDensity, depth);
        System.out.println("Tekanan dalam air adalah: " + pressure + " pascal(Pa)");
}
}