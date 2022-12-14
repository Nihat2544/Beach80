package Beach_80.src.day37_overridding;

public class FSupra extends EToyota {


    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private methodlar override edilemez
        Eger child class'da parent class'daki private method ile
        ayni signature'da bir method olusturursaniz
        bu overridding method olmaz
         */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu javaya bir gorev verir
        Java bu notasyonla birbirine bagli olan iki methodu
        surekli kontrol eder
        Eger parent class'daki overridden method'u silerseniz
        CTE verir

        @Override notasyonu kullanmak mecburi degildir
        Eger Overridding method silinirse, kodun CTE vermesini istersek
        @Override notasyonu kullanmaliyiz
         */
    }
}

