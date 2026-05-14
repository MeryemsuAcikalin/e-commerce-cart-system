package factory;

import model.Product;

public class CameraFactory implements ProductFactory {
    @Override
    public Product urunOlustur() {
        return new Product("Camera", 7850);
    }
}
