import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String []args){

        int a,b,c;
        double u;
        //Kullanıcıdan girdi almaya hazılanıyoruz
        Scanner girdi= new Scanner(System.in);
        //Kullanıcıdan üçken kenarlarının girdisini alıyoruz
        System.out.print("Lütfen 1. kenarı girinizi: ");
        a=girdi.nextInt();
        System.out.print("Lütfen 2. kenarı giriniz: ");
        b= girdi.nextInt();
        System.out.print("Lütfen 3. kenarı giriniz: ");
        c= girdi.nextInt();
        //Üçgenin u sunu hesaplıyoruz
        u = (a + b + c) /2;
        //Sonuçları gösteriyoruz
        System.out.println("Üçgenin Çevresi= "+2*u);
        System.out.print("Üçgenin Alanı= "+ Math.sqrt(u * (u-a)* (u-b) * (u-c)));


    }
}
