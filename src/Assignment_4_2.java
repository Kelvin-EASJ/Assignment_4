import java.util.Scanner;

public class Assignment_4_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Skriv point 1 (lat og long) i degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Skriv point 2 (lat og long) i degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double gcDistance = gcDistance(x1, y1, x2, y2);

        System.out.println("Distancen mellem de to pointer er " + gcDistance + " km");
    }

    private static double gcDistance(double x1, double y1, double x2, double y2) {
        double r1 = Math.toRadians(x1);
        double s1 = Math.toRadians(y1);
        double r2 = Math.toRadians(x2);
        double s2 = Math.toRadians(y2);

        final double RADIUS = 6371.01;
        double d = RADIUS * Math.acos(Math.sin(r1) * Math.sin(r2) + Math.cos(r1) * Math.cos(r2) * Math.cos(s1 - s2));

        return d;
    }
}
