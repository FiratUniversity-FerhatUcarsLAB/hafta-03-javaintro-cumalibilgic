public class Daire {
    public static void main(String[] args) {
        // Görev 3.1: Daire

        // Yarıçap ve pi değerlerini tanımla
        double r = 5.5;
        double pi = 3.14159; // Java'nın kendi Math.PI sabitini de kullanabilirsiniz

        // Alan hesapla (Alan = π * r * r)
        double alan = pi * r * r;

        // Çevre hesapla (Çevre = 2 * π * r)
        double cevre = 2 * pi * r;

        // Sonuçları yazdır
        System.out.println("Yarıçap: " + r);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}