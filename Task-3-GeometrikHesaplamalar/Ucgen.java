public class Ucgen {
    public static void main(String[] args) {
        // Görev 3.3: Üçgen (Heron Formülü)

        // Kenarları tanımla
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // Çevre hesapla
        double cevre = a + b + c;

        // Yarı çevreyi (s) hesapla
        double s = cevre / 2.0;

        // Alanı hesapla (Heron Formülü: Alan = kök(s * (s-a) * (s-b) * (s-c)))
        // Math.sqrt() fonksiyonu karekök almak için kullanılır
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Sonuçları yazdır
        System.out.println("Kenar a: " + a);
        System.out.println("Kenar b: " + b);
        System.out.println("Kenar c: " + c);
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }
}