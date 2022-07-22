package KosulluIfadeBloklari;
import java.util.Scanner;

public class GradeCalculationProgram {

    public static void main(String[] args) {
        int mat, chem, geom, bio, turk;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.println("Kimya Notunuz: ");
        chem = input.nextInt();
        System.out.println("Geometri Notunuz: ");
        geom= input.nextInt();
        System.out.println("Biyoloji Notunuz: ");
        bio = input.nextInt();
        System.out.println("Türkçe Notunuz: ");
        turk= input.nextInt();

        int[] sayilar = {mat,chem,geom,bio,turk};
        int total = 0, counter=0;
        for( int i= 0; i< sayilar.length; i++){
           if(!((sayilar[i]<=0)||(sayilar[i]>100))){
               counter++;
               total = sayilar[i]+total;
           }
        }
        System.out.println("Ortalamanız: "+ total/counter);
    }

}

