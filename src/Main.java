import legacy.OldCart;

public class Main {
    public static void main(String[] args) {
        OldCart sepet = new OldCart();

        sepet.urunEkle("Laptop", 35000);
        sepet.urunEkle("Camera", 7850);
        sepet.urunEkle("Mouse", 1200);

        sepet.sepetGoruntule();

        double toplamTutar = sepet.odenecekTutar("Ogrenci");
        System.out.println("Toplam tutar: " + toplamTutar + "TL");

    }
}
