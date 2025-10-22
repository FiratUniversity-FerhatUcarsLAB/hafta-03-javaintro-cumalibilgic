public class BmiHesaplama {

    public static void main(String[] args) {

        // --- Bonus Görev 2: Vücut Kitle İndeksi (BMI) Hesaplama ---

        // Gerekli değişkenleri 'double' olarak tanımlıyoruz,
        // çünkü ondalıklı değerler alabilirler.

        // Kilo (kg cinsinden)
        double kilo = 80.5;

        // Boy (metre cinsinden, örn: 1.75)
        double boy = 1.75;

        // Formülü uygulayarak BMI'yi hesaplıyoruz
        // BMI = kilo / (boy * boy)
        double bmi = kilo / (boy * boy);


        // --- Sonucu Yazdırma ---

        System.out.println("--- Vücut Kitle İndeksi Hesaplayıcı ---");
        System.out.println("Girilen Kilo: " + kilo + " kg");
        System.out.println("Girilen Boy: " + boy + " m");

        // Sonucun çok uzun ondalıklı bir sayı çıkmasını engellemek
        // ve daha okunaklı hale getirmek için yine System.out.printf kullanabiliriz.
        // "%.2f" -> ondalık noktadan sonra 2 basamak göster anlamına gelir.

        System.out.printf("Vücut Kitle İndeksi (BMI): %.2f\n", bmi);

        /* // printf kullanmadan yapmak isterseniz:
        System.out.println("Vücut Kitle İndeksi (BMI): " + bmi);
        // (Bu, 26.285714285714285 gibi çok uzun bir sayı çıkarabilir)
        */
    }
}