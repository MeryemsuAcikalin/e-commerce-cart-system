import cart.Cart;
import cart.OldCartAdapter;
import decorator.WarrantyDecorator;
import factory.CameraFactory;
import factory.LaptopFactory;
import factory.MouseFactory;
import legacy.OldCart;
import model.Product;

public class Main {
    public static void main(String[] args) {
        Cart sepet = new OldCartAdapter(new OldCart());

        Product camera = new CameraFactory().urunOlustur();
        Product laptop = new LaptopFactory().urunOlustur();
        Product mouse = new MouseFactory().urunOlustur();

        Product laptopGarantili = new WarrantyDecorator(laptop);
        sepet.urunEkle(laptopGarantili);
        sepet.urunEkle(camera);
        sepet.urunEkle(mouse);

        sepet.sepetGoruntule();

        double toplamTutar = sepet.odenecekTutar("Ogrenci");
        System.out.println("Toplam tutar: " + toplamTutar + "TL");
    }
}
