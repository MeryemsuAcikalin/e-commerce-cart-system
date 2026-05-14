package cart;

import legacy.OldCart;
import model.Product;

public class OldCartAdapter implements Cart {
    private OldCart sepet;

    public OldCartAdapter(OldCart sepet) {
        this.sepet = sepet;
    }

    @Override
    public void urunEkle(Product urun) {
        sepet.urunEkle(urun.getUrunAdi(), urun.getUrunFiyati());
    }

    @Override
    public void sepetGoruntule() {
        sepet.sepetGoruntule();
    }

    @Override
    public double odenecekTutar(String indirimTuru) {
        return sepet.odenecekTutar(indirimTuru);
    }

}
