public class CarpimTablosu {

    public static void main(String[] args) {

        // 5.3 - Çarpım Tablosu
        // Görev: 2'nin çarpım tablosunu 1'den 10'a kadar yazdırmak.

        int sayi = 2; // Çarpım tablosu yapılacak ana sayı

        System.out.println("5.3 - Çarpım Tablosu (" + sayi + "'ler)");
        System.out.println("---------------------------");

        // 1'den 10'a kadar (10 dahil) giden bir döngü başlatıyoruz.
        // 'i' değişkeni sırasıyla 1, 2, 3, ..., 10 değerlerini alacak.
        for (int i = 1; i <= 10; i++) {

            // Ana sayıyı (2) mevcut 'i' değeriyle çarpıyoruz.
            int sonuc = sayi * i;

            // Sonucu istenen formatta ekrana yazdırıyoruz.
            // Örnek: "2 x 1 = 2"
            System.out.println(sayi + " x " + i + " = " + sonuc);
        }
    }
}