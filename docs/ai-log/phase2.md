# phase2 ai-log

## AI'a sorduğum sorular:
-Bu projede Adapter ve Decorator örüntülerini kullandım sence bunlar doğru ve yeterli mi ?
-Başka hangi Structural örüntüleri kullanabilirdim sence ?

## AI'ın cevabı (Özet):

1. Soru için
AI Adapter örüntüsünü gayet iyi yaptığımı söyledi.Fakat OlldCartAdapter ve OldCart arasında sıkı bağ olmasını sorun olarak gördü. Bunu interface ile düzeltebileceğimi söyledi.
Decorator örüntüsünde mantığımın doğru olduğunu fakat ProductDecorator sınıfının abstract sınıf yapmamın daha temiz bir yapı oluşturacağını söyledi.

2. Soru için
AI Composite, Facade ve Bridge kullanabileceğimi söyledi.
Composite'yi yeni özellikler eklemek için yani ürünlerde gruplama yapmam için kullanabileceğimi söyledi.
Facade'yi Main sınıfında bulunan karmaşık ve fazla kodu OrderFacade sınıfı açarak o sınıfta gizleyebileceğimi söyledi.
Bridge de ise  indirim hesaplamayı implementasyon yardımıyla indirimleri hem daha bağımsız hem de OldCart içinde gömülü olmaktan kurtarabileceğimi söyledi.

## AI'ın yanlış veya eksik önerdiği bir şey buldunuz mu?

AI'ın genel olarak doğru önerilerde bulunduğunu düşünüyorum. Fakat benim gözümde bridge kullanmak şu anlık gerekli değil. Çünkü bu indirim yapısını ben Behavioral örüntü kullanarak çözmeyi planlıyorum.
Composite önerisinde ise projemde ürünleri gruplayarak sepete eklemek gibi bir özelliği gerekli görmüyorum.