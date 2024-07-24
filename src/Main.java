import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int tahminSayisi, can = 5, i = 0;
        int sayi = rand.nextInt(100);
        boolean oyunDurum = false;

        int[] tahminler = new int[5];


        System.out.println("----------Sayı Tahmin Oyununa Hoşgeldiniz----------");
        while (can > 0) {
            System.out.println();
            System.out.println("tahmininizi giriniz : ");
            tahminSayisi = input.nextInt();

            if ((tahminSayisi < 0) || (tahminSayisi > 99)) {
                System.out.println("lütfen 0-99 arası değerler giriniz.");
                continue;
            }

            tahminler[i++] = tahminSayisi;

            if (tahminSayisi == sayi) {
                oyunDurum = true;
                System.out.println("Başarılı tahmin!");
                System.out.println("Tahmininiz = " + tahminSayisi);
                System.out.println("Kalan can = " + can);
                break;

            } else {
                System.out.println("tekrar deneyin.Kalan can = " + --can);
            }


            if (oyunDurum == true) {
                System.out.println("başarılı tahmin");
                System.out.println("tahmininiz = " + tahminSayisi);
                System.out.println("Kalan can = " + can);
            } else {
                System.out.println("başaramadınız...");
            }

            System.out.println("tahmin ettiğiniz sayılar : ");
            for (int tahmin : tahminler) {
                if (tahmin != 0)
                    System.out.print(tahmin + ",");
            }
        }
    }
}