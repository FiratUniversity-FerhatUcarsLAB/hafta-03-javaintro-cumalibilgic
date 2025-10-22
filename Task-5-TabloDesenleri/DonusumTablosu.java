public class DonusumTablosu {
    public static void main(String[] args) {
        // Görev 5.2: Dönüşüm Tablosu (Mil -> Kilometre)

        // 1 mil = 1.609 kilometre sabitini tanımla
        final double MIL_TO_KM = 1.609;

        // Başlıkları yazdır
        // %-10s : Sola yaslı, 10 karakterlik yer ayıran String
        System.out.printf("%-10s %-10s\n", "Mil", "Kilometre");
        System.out.println("---------------------");

        // Değerler
        int mil1 = 1;
        int mil2 = 5;
        int mil3 = 10;
        int mil4 = 20;
        int mil5 = 50;

        // Hesaplamalar
        double km1 = mil1 * MIL_TO_KM;
        double km2 = mil2 * MIL_TO_KM;
        double km3 = mil3 * MIL_TO_KM;
        double km4 = mil4 * MIL_TO_KM;
        double km5 = mil5 * MIL_TO_KM;

        // Tabloyu formatlı yazdır
        // %-10d   : Sola yaslı, 10 karakterlik integer
        // %-10.3f : Sola yaslı, 10 karakterlik float (3 ondalık basamaklı)
        System.out.printf("%-10d %-10.3f\n", mil1, km1);
        System.out.printf("%-10d %-10.3f\n", mil2, km2);
        System.out.printf("%-10d %-10.3f\n", mil3, km3);
        System.out.printf("%-10d %-10.3f\n", mil4, km4);
        System.out.printf("%-10d %-10.3f\n", mil5, km5);
    }
}