package decorator;

import model.Product;

public class WarrantyDecorator extends ProductDecorator {

    public WarrantyDecorator(Product urun) {
        super(urun);

    }

    @Override
    public String getUrunAdi() {
        return urun.getUrunAdi() + " + Garanti";
    }

    @Override
    public double getUrunFiyati() {
        return urun.getUrunFiyati() + 1300;
    }

}
