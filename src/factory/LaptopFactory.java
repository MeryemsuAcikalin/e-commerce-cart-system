package factory;

import model.Product;

public class LaptopFactory implements ProductFactory {

    @Override
    public Product urunOlustur() {

        return new Product("Laptop", 35000);
    }

}
