
import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {

    public static int formTriangle(){
        int x, y ,z;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Enter value of x:");
                x = scanner.nextInt();
                if (!(x <= 0)) {
                    //return x;
                    for (; ; ) {
                        Scanner scanner1 = new Scanner(System.in);
                        try {
                            System.out.println("Enter value of y:");
                            y = scanner1.nextInt();
                            if (!(y <= 0)) {
                                //return y;
                                for (; ; ) {
                                    Scanner scanner2 = new Scanner(System.in);
                                    try {
                                        System.out.println("Enter value of z:");
                                        z = scanner2.nextInt();
                                        if (!(z <= 0)) {
                                            //return z;
                                            if (x == y && y == z) {
                                                System.out.println("Triangle is Equilateral");
                                            } else if (x == y && y != z || z == x && x != y || z == y && z != x) {
                                                System.out.println("Triangle is Isosceles");
                                            }  else if (x >= (y + z) || y >= (x + z) || z >= (y + x)) {
                                                System.out.println("Entered values "+x+", "+y+" and "+z+" are invalid - can’t form Triangle");
                                                System.out.println("The Triangle Inequality Theorem states that the sum of any 2 sides of a " +
                                                        "triangle must be greater than the measure of the third side.");
                                            } else if (x != y && y != z && z != x) {
                                                System.out.println("Triangle is Scalene");
                                            }
                                            return z;

                                        } else {
                                            System.out.println("Please enter a valid value for z.");
                                            System.out.println("User must enter value of z > = 0 in order to form triangle");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Entered value of z is not number : Must be a number");
                                    }
                                }
                            } else {
                                System.out.println("Please enter a valid value for y.");
                                System.out.println("User must enter value of y > = 0 in order to form triangle");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entered value of y is not number : Must be a number");
                        }
                    }
                } else {
                    System.out.println("Please enter a valid value for x.");
                    System.out.println("User must enter value of x > = 0 in order to form triangle");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entered value of x is not number : Must be a number");
            }
        }
    }

    public static void main(String[] args) {
        formTriangle();

    }
}








