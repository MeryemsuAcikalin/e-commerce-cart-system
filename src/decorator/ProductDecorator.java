package decorator;

import model.Product;

public class ProductDecorator extends Product {
    protected Product urun;

    public ProductDecorator(Product urun) {
        super(urun.getUrunAdi(), urun.getUrunFiyati());
        this.urun = urun;
    }

}
