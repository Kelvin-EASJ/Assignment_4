import java.util.Scanner;

public class Assignment_4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Indtast siden: ");

        double side = input.nextDouble();

        double area = areaOfHexagon(side);

        System.out.println("Arealet af hexagonen er " + area);
    }

    private static double areaOfHexagon(double side) {
        return (6 * side * side) / (4 * Math.tan(Math.PI / 6));
    }
}
