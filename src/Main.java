import factory.CameraFactory;
import factory.LaptopFactory;
import factory.MouseFactory;
import legacy.OldCart;
import model.Product;

public class Main {
    public static void main(String[] args) {
        OldCart sepet = new OldCart();

        Product camera = new CameraFactory().urunOlustur();
        Product laptop = new LaptopFactory().urunOlustur();
        Product mouse = new MouseFactory().urunOlustur();

        sepet.urunEkle(camera.getUrunAdi(), camera.getUrunFiyati());
        sepet.urunEkle(laptop.getUrunAdi(), laptop.getUrunFiyati());
        sepet.urunEkle(mouse.getUrunAdi(), mouse.getUrunFiyati());

        sepet.sepetGoruntule();

        double toplamTutar = sepet.odenecekTutar("Ogrenci");
        System.out.println("Toplam tutar: " + toplamTutar + "TL");
    }
}
