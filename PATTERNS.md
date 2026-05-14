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

## FAZ2 Adapter Pattern ve Decorator Pattern

## 1. Adapter Pattern

### Nerede kullanıldı?
Eski OldCart sınıfını Product tabanlı bir sistemle uyumlu hale gelmesi için kullanıldı.
Sınıflar:
-Cart
-OldCartAdapter

### Neden kullanıldı:
Projede ürün eklerken ürün adı ve fiyatı ayrı ayrı alınıyordu. Faz1 de ürünleri Product nesnesi olarak oluşturmaya başladık fakat OldCart Product nesnesiyle doğrudan çalışmadığı için aralarında uyumsuzluk oldu. Bu uyumsuzluğu çözmek için de adapter kullandım.

### Ne kazanıldı:
Mevcut kodu bozmadan yeni bir kullanım şekli eklenmiş oldu. 
Eski yapıyla yeni yapı arasındaki uyumsuzluk giderildi.
Sepete ürünler Product nesnesi olarak eklenebilir hale getirildi. 

## 2. Decorator Pattern

### Nerede kullanıldı?
Ürünlere yeni özellikler eklemek için kullanıldı.
Sınıflar:
-ProductDecorator
-WarrantyDecorator

### Neden kullanıldı:
Yeni özellik ekleneceğinde Product sınıfına eklemek gerekiyordu ama bu durum sınıfın şişmesine sebep olacağı için Decorator Pattern kullandım.

### Ne kazanıldı:
Mevcut kodun yapısı kırılmadan genişletildi.
Ürünlere Product sınıfını bozmadan garanti paketi eklenebilir hale getirildi.