package Beach_80.src.day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_ArrayOlustur {
    //Soru 4- Kullanicidan bir array’in boyutunu ve tum elementlerini alarak
    // bir array olusturup, bu array’i bize donduren bir method olustur
    public static void main(String[] args) {
        int[] sayilar = arrayOlustur();
        System.out.println(Arrays.toString(sayilar));
    }

    public static int[] arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elemanli bir array olusturmami istersiniz ");
        int uzunluk = scan.nextInt();
        int[] olusturulan = new int[uzunluk];

        int sayi = 0;

        for (int i = 0; i < uzunluk; i++) {
            System.out.println(i + ". index icin sayi giriniz");
            olusturulan[i] = scan.nextInt();


        }

        return olusturulan;
    }

}
