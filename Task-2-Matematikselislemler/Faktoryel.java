public class Faktoryel {
    public static void main(String[] args) {

    int sayi = 5;
    long faktoriyel = 1; // Çarpma işlemi için etkisiz eleman 1'dir.

    // 1'den 'sayi'ya kadar (sayi dahil) döngü
    for (int i = 1; i <= sayi; i++) {
        faktoriyel = faktoriyel * i;
    }

    // Sonucu ekrana yazdır
    System.out.println(sayi + "! = " + faktoriyel);
}
}
