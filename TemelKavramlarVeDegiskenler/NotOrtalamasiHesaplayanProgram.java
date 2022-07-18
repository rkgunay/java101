import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {

    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        String[] dersler = {"Fizik", "Kimya", "Türkce", "Tarih", "Müzik"};

        int not = 0;
        for(int i=0; i<5; i++){

            System.out.println(dersler[i] + " notunu giriniz:");
            not+=girdi.nextInt();
        }
        double ortalama = not/5;
        System.out.println((ortalama>=60.0)?"Sınıfı Geçti":"Sınıfta Kaldı");
    }
}
