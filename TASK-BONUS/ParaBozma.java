public class ParaBozma {

    public static void main(String[] args) {

        // --- Bonus Görev 3: Para Bozma (if ve while olmadan) ---

        // Farkı görmek için farklı bir miktar kullanalım: 230 TL
        int paraMiktari = 230;

        int kalanPara = paraMiktari;

        System.out.println("--- Para Bozma Makinesi (Koşulsuz Çıktı) ---");
        System.out.println("Bozulacak Tutar: " + paraMiktari + " TL");
        System.out.println("---------------------------");

        // 1. 100 TL'likleri Hesapla
        int adet100 = kalanPara / 100; // 230 / 100 = 2
        kalanPara = kalanPara % 100; // 230 % 100 = 30

        // 2. 50 TL'likleri Hesapla
        int adet50 = kalanPara / 50;  // 30 / 50 = 0
        kalanPara = kalanPara % 50;  // 30 % 50 = 30

        // 3. 20 TL'likleri Hesapla
        int adet20 = kalanPara / 20;  // 30 / 20 = 1
        kalanPara = kalanPara % 20;  // 30 % 20 = 10

        // 4. 5 TL'likleri Hesapla
        int adet5 = kalanPara / 5;   // 10 / 5 = 2
        kalanPara = kalanPara % 5;   // 10 % 5 = 0

        // 5. 2 TL'likleri Hesapla
        int adet2 = kalanPara / 2;   // 0 / 2 = 0
        kalanPara = kalanPara % 2;   // 0 % 2 = 0

        // 6. 1 TL'likleri Hesapla
        int adet1 = kalanPara / 1;   // 0 / 1 = 0


        // --- Sonuçları Yazdırma (if kullanmadan) ---
        // Bu çözüm, "if" veya "while" kullanmama kuralına uyar
        // ve hesaplanan her sonucu koşulsuz olarak ekrana basar.

        System.out.println(adet100 + " x 100 TL");
        System.out.println(adet50 + " x 50 TL");
        System.out.println(adet20 + " x 20 TL");
        System.out.println(adet5 + " x 5 TL");
        System.out.println(adet2 + " x 2 TL");
        System.out.println(adet1 + " x 1 TL");
    }
}