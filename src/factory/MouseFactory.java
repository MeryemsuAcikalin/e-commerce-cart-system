package factory;

import model.Product;

public class MouseFactory implements ProductFactory{
    @Override
    public Product urunOlustur() {
        return new Product("Mouse", 1200);
    }

}
