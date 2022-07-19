import java.util.Scanner;
public class VucutKitleEndeksiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Metre Cinsinden Girin: ");
        double height = input.nextDouble();
        System.out.println("Lütfen Kilonuzu Kilogram Cinsinden Girin:");
        double weight = input.nextDouble();
        double result = weight/(height*height);
        System.out.println("Vücut Kitle Endeksiniz: "+ result);
    }
}
