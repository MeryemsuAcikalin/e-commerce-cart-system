package cart;

import model.Product;

public interface Cart {
    void urunEkle(Product urun);

    void sepetGoruntule();

    double odenecekTutar(String indirimTuru);

}
