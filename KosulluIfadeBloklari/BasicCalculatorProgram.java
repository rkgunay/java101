import java.util.Scanner;
public class BasicCalculatorProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        int choice;
        System.out.println("Birinci Sayıyı Giriniz: ");
        a = input.nextFloat();

        System.out.println("İkinci Sayıyı Giriniz: ");
        b = input.nextFloat();

        System.out.println("İşlemler \n" +
                           "********************************");
        System.out.println("Toplama için: 1 (birinci+ikinci)");
        System.out.println("Çıkarma için: 2 (birinci-ikinci)");
        System.out.println("Çarpma için:  3 (birinci*ikinci)");
        System.out.println("Bölme için:   4 (birinci/ikinci)");
        System.out.println("********************************");

        System.out.println("Seçiminizi Yapın: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                System.out.println(a/b);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }


    }

}
