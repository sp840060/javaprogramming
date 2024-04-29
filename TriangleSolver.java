package ArrayAssignment;

import java.util.Scanner;

public class TriangleSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integers representing the sides of a triangle:");

        System.out.print("Side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Side 3: ");
        int side3 = scanner.nextInt();

        scanner.close();

        if (isValidTriangle(side1, side2, side3)) {
            determineTriangleType(side1, side2, side3);
        } else {
            System.out.println("Invalid sides. They do not form a triangle.");
        }
    }

    private static boolean isValidTriangle(int side1, int side2, int side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }

    private static void determineTriangleType(int side1, int side2, int side3) {
        if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}

