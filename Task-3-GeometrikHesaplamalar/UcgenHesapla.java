public class UcgenHesapla {
    public static void main(String[] args) {
                // Üçgenin kenar uzunlukları
                double a = 3;
                double b = 4;
                double c = 5;

                // 1. Yarı Çevre (s) Hesaplama
                double s = (a + b + c) / 2;

                // 2. Alan (A) Hesaplama (Heron Formülü)
                // Alan = karekök( s * (s-a) * (s-b) * (s-c) )
                double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

                // Sonuçları Ekrana Yazdırma
                System.out.println("Kenar Uzunlukları: a=" + a + ", b=" + b + ", c=" + c);
                System.out.println("Yarı Çevre (s): " + s);
                System.out.println("Üçgenin Alanı (Heron Formülü ile): " + alan);
    }
}


