import java.util.Scanner;
public class DikUcgendeHipotenusBulanProgram {
    public static void main(String[] args) {
        double a,b,hipo,u,cevre,alan;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Üçgenin Birinci Dik Kenarının Uzunluğunu Girin: ");
        a = girdi.nextDouble();

        System.out.println("Üçgenin İkinci Dik Kenarının Uzunluğunu Girin: ");
        b = girdi.nextDouble();

        hipo = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        u = (a+b+hipo)/2;

        cevre = 2 * u;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-hipo));

        System.out.println("Üçgenin Hipotenüs Uzunluğu: " +hipo);
        System.out.println("Üçgenin Alanı: " + alan);
        System.out.println("Üçgenin Çevresi: "+cevre);

    }
}
