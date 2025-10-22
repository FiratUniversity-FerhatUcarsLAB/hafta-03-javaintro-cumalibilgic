public class UsluSayilarTablosu {
    public static void main(String[] args) {
        // Görev 5.1: Üslü Sayılar Tablosu

        // Başlıkları yazdır
        // \t karakteri (tab) sütunlar arasında boşluk bırakır
        System.out.println("a\ta^2\ta^3");
        System.out.println("-----------------");

        // 1'den 5'e kadar olan sayılar için hesaplama yap ve yazdır

        // a = 1
        int a = 1;
        System.out.println(a + "\t" + (a * a) + "\t" + (a * a * a));

        // a = 2
        a = 2;
        System.out.println(a + "\t" + (a * a) + "\t" + (a * a * a));

        // a = 3
        a = 3;
        System.out.println(a + "\t" + (a * a) + "\t" + (a * a * a));

        // a = 4
        a = 4;
        System.out.println(a + "\t" + (a * a) + "\t" + (a * a * a));

        // a = 5
        a = 5;
        System.out.println(a + "\t" + (a * a) + "\t" + (a * a * a));
    }
}