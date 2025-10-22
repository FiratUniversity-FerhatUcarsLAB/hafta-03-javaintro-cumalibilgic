public class IkiIslem {
    public static void main(String[] args) {
        // Görev 2.2: İki İşlem Sonucu

        // Pay hesapla
        double pay = (9.5 * 4.5) - (2.5 * 3);

        // Payda hesapla
        double payda = 45.5 - 3.5;

        // Bölme yap
        double sonuc = pay / payda;

        // Formatla ve yazdır (Sonucu 4 ondalık basamak ile yazdır)
        // Önemli: printf ile formatlama!
        System.out.printf("Sonuç: %.4f\n", sonuc);
    }
}