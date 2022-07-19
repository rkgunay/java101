import java.util.Scanner;
public class TaximeterCalculationProgram {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice=0;
        Scanner input = new Scanner(System.in);
        System.out.println("How many kilometers taximeter says:");
        km = input.nextInt();

        total = perKm*km + startPrice;
        total = (total<20)?20:total;
        System.out.println("Total Cost : $" + total);

    }
}
