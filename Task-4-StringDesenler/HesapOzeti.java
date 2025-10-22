public class HesapOzeti {
    public static void main(String[] args) {
        // Görev 4.3: Hesap Özeti

        // Ürün bilgileri
        String urun1 = "Ekmek";
        int miktar1 = 2;
        double fiyat1 = 10.00;

        String urun2 = "Süt (1L)";
        int miktar2 = 1;
        double fiyat2 = 25.50;

        String urun3 = "Yumurta (10'lu)";
        int miktar3 = 1;
        double fiyat3 = 50.75;

        String urun4 = "Çikolata";
        int miktar4 = 3;
        double fiyat4 = 15.25;

        // Satır toplamlarını hesapla
        double toplam1 = miktar1 * fiyat1;
        double toplam2 = miktar2 * fiyat2;
        double toplam3 = miktar3 * fiyat3;
        double toplam4 = miktar4 * fiyat4;

        // Genel toplam
        double genelToplam = toplam1 + toplam2 + toplam3 + toplam4;

        // Tabloyu printf ile formatlı olarak yazdır
        // %-20s : Sola yaslı, 20 karakterlik yer ayıran String
        // %8s  : Sağa yaslı, 8 karakterlik yer ayıran String
        // %12s : Sağa yaslı, 12 karakterlik yer ayıran String
        // \n     : Yeni satıra geç

        // Başlık satırı
        System.out.println("***************** HESAP ÖZETİ *****************");
        System.out.printf("%-20s %8s %12s %12s\n", "ÜRÜN ADI", "MİKTAR", "BİRİM FİYAT", "TOPLAM");
        System.out.println("------------------------------------------------------");

        // Ürün satırları
        // %-20s : String
        // %8d  : Integer (tamsayı)
        // %12.2f: Ondalıklı sayı (virgülden sonra 2 basamak)
        System.out.printf("%-20s %8d %12.2f %12.2f\n", urun1, miktar1, fiyat1, toplam1);
        System.out.printf("%-20s %8d %12.2f %12.2f\n", urun2, miktar2, fiyat2, toplam2);
        System.out.printf("%-20s %8d %12.2f %12.2f\n", urun3, miktar3, fiyat3, toplam3);
        System.out.printf("%-20s %8d %12.2f %12.2f\n", urun4, miktar4, fiyat4, toplam4);

        // Ayırıcı çizgi
        System.out.println("------------------------------------------------------");

        // Genel Toplam satırı
        // İlk 30 karakteri (20+8) "GENEL TOPLAM" yazısı için sağa yaslı kullan
        System.out.printf("%40s %12.2f\n", "GENEL TOPLAM:", genelToplam);
        System.out.println("******************************************************");
    }
}