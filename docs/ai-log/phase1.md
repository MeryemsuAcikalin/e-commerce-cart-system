# phase1 ai-log

## AI'a sorduğum prompt:
Bu kodu Creational örüntü kapsamında inceler misin ?
Ben Factory method kullandım bu doğru mu?
Başka hangi Creational örüntülerini kullanabilirdim ?
Nesne yaratma sorumluluğu merkezi ve esnek bir yapı olmuş mu ?
Eksik veya hatalı bir kısım var mı?

## AI'ın cevabı:

Genel olarak AI yaptığım geliştirmelerin doğru olduğunu söyledi.
Factory Method dışında Abstract Factory veya Builder kullanabileceğimi söyledi fakat şuanlık Factory Methodun yeterli olduğunu söyledi.
Eksik olarak Product sınıfında fiyat kontrolü olmamasını ve indirim türünün hala String olarak yapılmasını söyledi.

## Ben ne yaptım ve neden aynı/farklı:

AI'ında dediği gibi Factory Methodunu kullanarak ProductFactory interface'i oluşturdum ve bu interface'i LaptopFactory, CameraFactory ve MouseFactory sınıflarına implementsle bağlanmasını sağladım
Bu fazda 'Nesne yaratma sorumluluğunu merkezi ve esnek bir yapıya taşıyın' görevi olduğu için AI'ın dediği indirim ve fiyat türüyle alaklı değişiklikleri uygulamadım.
Son olarak AI abstract ve Builder örüntülerini kullanabileceğimi söylemişti ancak bu kodda bu örüntüleri kullanmakyı gerektirecek kadar kapsamlı bir yapı olmadığı için kullanmadım.