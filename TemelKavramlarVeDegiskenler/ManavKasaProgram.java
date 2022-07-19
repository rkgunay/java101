import java.util.Scanner;
public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kilosunu giriniz: ");
        double armutFiyat = input.nextDouble()*armut;

        System.out.println("Elma kilosunu giriniz: ");
        double elmaFiyat = input.nextDouble()*elma;

        System.out.println("Domates kilosunu giriniz: ");
        double domatesFiyat = input.nextDouble()*domates;

        System.out.println("Muz kilosunu giriniz: ");
        double muzFiyat = input.nextDouble()*muz;

        System.out.println("Patlıcan kilosunu giriniz: ");
        double patlicanFiyat = input.nextDouble()*patlican;
        double toplam= elmaFiyat+armutFiyat+domatesFiyat+muzFiyat+patlicanFiyat;
        System.out.println("Toplam Tutar: "+toplam);
    }
}

