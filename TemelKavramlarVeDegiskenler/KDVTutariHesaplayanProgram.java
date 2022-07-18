import java.util.Scanner;
public class KDVTutariHesaplayanProgram {
    public static void main(String[] args) {
        System.out.println("KDV hesabı yapmak istediğniz ürünün fiyatını giriniz:");
        Scanner girdi = new Scanner(System.in);
        int deger = girdi.nextInt();
        System.out.println("KDV'siz Fiyat: "+ deger);
        System.out.println("KDV'li Fiyat " + ((deger>=0&&deger<=1000)?deger*1.18:deger*1.08));
        System.out.println("KDV Tutarı: " + ((deger>=0&&deger<=1000)?deger*0.18:deger*0.08));

    }
}
