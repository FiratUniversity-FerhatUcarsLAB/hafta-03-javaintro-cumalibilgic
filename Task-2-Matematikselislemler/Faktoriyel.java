public class Faktoriyel {
    public static void main(String[] args) {
        // Görev 2.3: Faktöriyel
        // 5! = 5 * 4 * 3 * 2 * 1
        // Ara adımları gösterin

        // Adım 1:
        int adim1 = 5 * 4;
        System.out.println("5 * 4 = " + adim1);

        // Adım 2:
        int adim2 = adim1 * 3;
        System.out.println(adim1 + " * 3 = " + adim2);

        // Adım 3:
        int adim3 = adim2 * 2;
        System.out.println(adim2 + " * 2 = " + adim3);

        // Adım 4 (Sonuç):
        int sonuc = adim3 * 1;
        System.out.println(adim3 + " * 1 = " + sonuc);

        System.out.println("5! Sonuç = " + sonuc);
    }
}