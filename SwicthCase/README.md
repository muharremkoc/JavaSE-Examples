# Switch-Case Döngüsü
Switch, birçok alternatif arasında bir kod bloğu yürütmemize izin verir.

##### Kullanım Amacı
- Birden fazla döngü döndürmek yerine tek bir kod bloğu döndürmeyi sağlar.

##### Switch-Case Tanımlama
```java

switch (expression) {
  case value1:
  //ifade, value1'e eşit ise
  //eğer çalıştırılacak kod
    //ifade, value1'e eşit ise
    break;
  
  case value2:
  //eğer çalıştırılacak kod
    //ifade, value2'e eşit ise
    break;
  
  ...
  
  default:
    // varsayılan ifadeler
  }

```
- [expression]-Aranacak Değer.
- [value]-Kontrol'ü yapılan değer.
- [break]-Program'dan çıkmak için uygulanan işlem.
- [default]-Aranacak değer'in Kontrol Yapılan değer'e eşit olmadığı durumlar'da çalışır.

> break; komutu yazılmaz ise Kontrol'ü yapılan değerden itibaren sonraki break;'a kadar tüm komutları çalıştırır.

----

Muharrem Koç Java Developer

----

