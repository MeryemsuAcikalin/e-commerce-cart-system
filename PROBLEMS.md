# PROBLEMS.md

## Faz0

## Benim gördüğüm tasarım sorunları:

### 1. String şeklinde indirim türünün kontrol edilmesi.
Kullanıcı indirim türünü yanlış yazarsa indirim doğru uygulanmaz.

### 2. OldCart sınıfının birden fazla sorumluluğunun olması.
OldCart sınıfında hem ürünler tutuluyor hem tutar hesaplanıyor hem de indirim uygulanıyor.

### 3. İndirimin if-else ile uygulanması.
Yeni bir indirim ekleneceği zaman yeni bir else if eklenerek metodun değiştirilmesi gerekiyor.

### 4. Kodu test etmek zor.
İndirim hesaplama ve ürün ekleme işlemleri aynı sınıf içinde olduğu için kodun belli bir kısmını kontrol etmek zor.

### 5. Kod SOLID prensibinin Açık/Kapalı prensibini ihlal ediyor.
OldCart sınıfı geliştirmeye açık ama değişikliğe kapalı değil.

### 6. Fiyat bilgisi pozitif mi negatif mi kontrolünün olmaması
EEğer fiyat bilgisi negatif yazılırsa doğu bir ücret hesabı yapılmaz.

## AI'ın gördüğü tasarım sorunları ve çözümleri:

## 1. Ürün adı ve ürün fiyatı ayrı listelerde tutulmuş

Kodda ürün adları `urunAdlari`, fiyatlar ise `urunFiyatlari` listesinde tutuluyor. Bu durum risklidir çünkü iki listenin sırası bozulursa ürün adı ile fiyatı eşleşmeyebilir.

**Çözüm Önerisi:**  
`Product` adında ayrı bir sınıf oluşturulabilir. Ürün adı ve fiyatı aynı nesne içinde tutulur.

**Kullanılabilecek Tasarım Yaklaşımı:**  
Encapsulation / Nesne yönelimli tasarım

---

## 2. `OldCart` sınıfı birden fazla sorumluluk taşıyor

`OldCart` sınıfı hem ürünleri saklıyor, hem ürün ekliyor, hem toplam tutarı hesaplıyor, hem indirim uyguluyor, hem de sepeti ekrana yazdırıyor. Bu durum kodun bakımını zorlaştırır çünkü farklı nedenlerle aynı sınıfın değiştirilmesi gerekir.

**Çözüm Önerisi:**  
Sepet yönetimi, indirim hesaplama ve sepet görüntüleme işlemleri ayrı sınıflara ayrılabilir.

**Kullanılabilecek Tasarım Yaklaşımı:**  
Single Responsibility Principle / Separation of Concerns

---

## 3. İndirim kuralları if-else bloklarıyla yazılmış

`odenecekTutar` metodunda indirim türleri `if-else` ile kontrol ediliyor. Yeni bir indirim türü eklendiğinde bu metodu değiştirmek gerekir. Bu da kodun büyüdükçe karmaşıklaşmasına neden olur.

**Çözüm Önerisi:**  
Her indirim türü ayrı bir sınıfta tanımlanabilir. Örneğin öğrenci indirimi, yılbaşı indirimi ve haftasonu indirimi ayrı sınıflar olabilir.

**Kullanılabilecek Tasarım Örüntüsü:**  
Strategy Pattern

---

## 4. İndirim türü String olarak gönderilmiş

Kodda indirim türü `"Ogrenci"` gibi String değer olarak gönderiliyor. Bu kullanım hataya açıktır çünkü `"Ogrenci"` yanlış yazılırsa indirim uygulanmaz.

**Çözüm Önerisi:**  
String yerine `enum` kullanılabilir veya doğrudan indirim nesnesi metoda gönderilebilir.

**Kullanılabilecek Tasarım Yaklaşımı:**  
Enum / Strategy Pattern

---

## 5. Ürün oluşturma işlemi Main sınıfında yapılmış

`Main` sınıfında ürünler doğrudan elle ekleniyor. Ürün oluşturma işlemi büyüdükçe `Main` sınıfı karmaşık hale gelebilir.

**Çözüm Önerisi:**  
Ürün oluşturma sorumluluğu ayrı bir sınıfa taşınabilir. Örneğin `ProductFactory` sınıfı ürünleri oluşturabilir.

**Kullanılabilecek Tasarım Örüntüsü:**  
Factory Method

---

## 6. Sepet görüntüleme işlemi konsola bağlı yazılmış

`sepetGoruntule` metodunda ürünler doğrudan `System.out.println` ile ekrana yazdırılıyor. Bu durum sepet sınıfını konsol çıktısına bağımlı hale getirir.

**Çözüm Önerisi:**  
Sepet görüntüleme işlemi ayrı bir sınıfa taşınabilir. Böylece ileride dosyaya yazdırma veya farklı ekranda gösterme daha kolay olur.

**Kullanılabilecek Tasarım Yaklaşımı:**  
Separation of Concerns / Single Responsibility Principle

---

## 7. `OldCart` sınıfı yeni özellikler eklendikçe büyümeye açık

Yeni indirim türü, kargo ücreti, vergi hesaplama veya kampanya sistemi eklendiğinde `OldCart` sınıfının sürekli değiştirilmesi gerekir. Bu da sınıfın zamanla büyüyüp karmaşıklaşmasına neden olur.

**Çözüm Önerisi:**  
Yeni özellikler ayrı sınıflara ayrılabilir. İndirimler, kargo ve vergi gibi işlemler sepet sınıfından ayrılmalıdır.

**Kullanılabilecek Tasarım Örüntüleri:**  
Strategy Pattern / Decorator Pattern

---

## 8. Sepet toplamı ve indirim hesaplama aynı metodun içinde yapılmış

`odenecekTutar` metodu hem sepetin toplam fiyatını hesaplıyor hem de indirim uyguluyor. Bu iki işlem farklı sorumluluklardır. Metot büyüdükçe okunması ve değiştirilmesi zorlaşır.

**Çözüm Önerisi:**  
Toplam tutar hesaplama ayrı, indirim uygulama ayrı yapılabilir. Örneğin sepet toplamı `Cart` içinde hesaplanır, indirim ise ayrı indirim sınıfları tarafından uygulanır.

**Kullanılabilecek Tasarım Örüntüsü:**  
Strategy Pattern

---

## 9. Ürün bilgileri sadece ad ve fiyat olarak tutulmuş

Ürünler sadece ad ve fiyat bilgisiyle temsil ediliyor. İleride kategori, stok, marka veya ürün kodu gibi bilgiler eklenmek istenirse mevcut yapı yetersiz kalır.

**Çözüm Önerisi:**  
Ürün bilgileri `Product` sınıfında tutulabilir. Böylece ürüne yeni özellikler eklemek daha düzenli olur.

**Kullanılabilecek Tasarım Yaklaşımı:**  
Encapsulation / Model sınıfı kullanımı

---

## 10. Varsayılan indirim davranışı açık değil

`indirimTuru` geçersiz girildiğinde herhangi bir uyarı verilmeden indirimsiz tutar döndürülüyor. Bu durum kullanıcı veya geliştirici açısından hatayı fark etmeyi zorlaştırır.

**Çözüm Önerisi:**  
Geçersiz indirim türü girildiğinde hata mesajı verilebilir veya `NoDiscount` gibi indirimsiz durumu temsil eden ayrı bir sınıf kullanılabilir.

**Kullanılabilecek Tasarım Örüntüsü:**  
Null Object Pattern / Strategy Pattern

## AI ne gördü, siz ne gördünüz, aralarında fark var mı?

## Benim gördüğüm sorunlar:
1. String şeklinde indirim türünün kontrol edilmesi.
2. OldCart sınıfının birden fazla sorumluluğunun olması.
3. İndirimin if-else ile uygulanması.
4. Kodu test etmek zor.
5. Kod SOLID prensibinin Açık/Kapalı prensibini ihlal ediyor.
6. Fiyat bilgisi pozitif mi negatif mi kontrolünün olmaması

## AI'ın gördüğü sorunlar:
1. Ürün adı ve ürün fiyatı ayrı listelerde tutulmuş
2. `OldCart` sınıfı birden fazla sorumluluk taşıyor
3. İndirim kuralları if-else bloklarıyla yazılmış
4. İndirim türü String olarak gönderilmiş
5. Ürün oluşturma işlemi Main sınıfında yapılmış
6. Sepet görüntüleme işlemi konsola bağlı yazılmış
7. `OldCart` sınıfı yeni özellikler eklendikçe büyümeye açık
8. Sepet toplamı ve indirim hesaplama aynı metodun içinde yapılmış
9. Ürün bilgileri sadece ad ve fiyat olarak tutulmuş
10. Varsayılan indirim davranışı açık değil

## Karşılaştırma:

Benim gördüğüm sorunlar ve AI'ın gördüğü sorunlar genel olarak aynı sorunlardır.
Benim gördüğüm sorunlar daha çok indirim sistemi, test edilebilirlik ve SOLID prensibi üzerinde duruyor.
AI ise daha ayrıntılı olarak benim gördüklerimin dışında ürün adı ve fiyatlarının ayrı listelerde olmasını, sepetteki ürünlerin gösterilmesinin konsola bağlı olmasını, ürün oluşturma işleminin Main sınıfında yapılmasını ve toplam tutar ile indirimin aynı metot içinde olmasını sorun olarak belirtmiş.
Sonuç olarak ikimizin gördüğü sorunların çoğu benzerdir. Ancak AI benim gördüğüm sorunlardan daha ayrıntılı sorunlar görmüştür.
