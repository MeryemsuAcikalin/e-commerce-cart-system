# PATTERNS.md

## FAZ1 Factory Method

### Nerede kullanıldı?
Ürün nesnelerini oluşturmakta kullanıldı
Sınıflar:
-Product
-ProductFactory
-LaptopFactory
-CameraFactory
-MouseFactory

### Neden kullanıldı:

Başlangıçtaki kodda ürün oluşturma Main sınıfının içerisindeydi. 
Bu yüzden Main sınıfında birden fazla sorumumluluk vardı ve aynı zamanda ürünlerin nasıl oluşturulduğunu, ürün adını ve ürün fiyatı bilgilerini bilmek zorunda kalıyordu. 
Bu nedenle nesne oluşturma Main sınıfından çıkartılıp Factory Method yapısına taşındı.

### Ne kazanıldı:

Ürün oluşturma tek bir yerde toplandı Böylece Main sınıfı daha sade hale geldi ve ürünün nasıl oluştuğu gibi gereksiz ayrıntıları bilmek zorunda kalmadı. 
Yeni bir ürün eklemek için oluşturma mantığı ProductFactory interface'ini uygulayan ayrı bir factory sınıfında yazıldı.