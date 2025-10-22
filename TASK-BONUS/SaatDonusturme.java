public class SaatDonusturme {

    public static void main(String[] args) {

        // --- Bonus Görev 1: Saat Dönüştürme ---

        // Farklı bir örnek: 86420 saniye (24 saatten biraz fazla)
        int toplamSaniye = 86420;

        // 1. Saati Bulma (1 saat = 3600 saniye)
        int saat = toplamSaniye / 3600;

        // 2. Kalan Saniyeyi Bulma (Saatleri çıkardıktan sonra)
        int kalanSaniye = toplamSaniye % 3600;

        // 3. Dakikayı Bulma (Kalan saniyelerden, 1 dakika = 60 saniye)
        int dakika = kalanSaniye / 60;

        // 4. Son Kalan Saniyeyi Bulma (Dakikaları da çıkardıktan sonra)
        int saniye = kalanSaniye % 60;


        // --- Sonucu Yazdırma ---

        System.out.println("Girilen Toplam Saniye: " + toplamSaniye);

        // Sonucu "saat:dakika:saniye" formatında yazdırıyoruz.
        // %02d formatı, sayının 2 haneden az olması durumunda başına "0" ekler.
        // (Örn: 5 -> "05", 0 -> "00")
        System.out.printf("Formatlı Sonuç: %d:%02d:%02d\n", saat, dakika, saniye);
    }
}