import java.util.Scanner;
public class AreaAndPerimeterCalculatorProgram {
    public static void main(String[] args) {
        double r, pie=3.14;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        r= input.nextDouble();

        System.out.println("Area of the circle is: "+ pie*r*r);
        System.out.println("Perimeter of the circle is: "+ 2*pie*r);

        System.out.println("Enter the angle degree to calculate slice area: ");
        double a= input.nextDouble();
        System.out.println("Area of the slice: "+ (pie*r*r*a)/360);

    }
}
