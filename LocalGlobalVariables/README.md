# Local ve Global Değişkenler
### Local Değişkenler
Herhangi bir döngü içerisinde tanımlanan ve tanımlandığı yerde kullanılan değişkenlerdir.
##### Kullanım Amacı
- Deüişkenin proje tamamında kullanılmasından kaynaklı sorunları engellemek.

##### Local Değişken Tanımlanması
```java
for (int i=0;i<=1;i++){
        //If  defined in any loop, it is a local variable.
        System.out.println(i);
        }
```

### Global Değişkenler
Proje'nin tamamında kullanılabilen değişkenlerdir.
##### Kullanım Amacı
- Değişkeni tekrar tekrar tanımlamak yerine proje'nin tamamında kullanmak.

##### Global Değişken Tanımı
```java
`//If not defined in any loop, it is a global variable.
        int a=5;
        int b=10;
        System.out.println(a);
        System.out.println(b);
```

| Karşılaştırma için temel| Yerel değişken	| Küresel değişken  |
| -------------|:-------------:| -----:|
|   deklarasyon    | Değişkenler bir işlev içinde bildirilir. |Değişkenler herhangi bir işlevin dışında bildirilir. |
| kapsam   | İçinde bildirildikleri bir işlev içinde.| Program boyunca. |
| Erişim | Program içinde,Yalnızca ifadelerde erişilir.     | Programın içindeki herhangi bir ifade ile erişilir.|
| hayat | Çıkışta fonksiyon bloğuna girildiğinde ve yok edildiğinde oluşturulur.      |Programınızın yürütüldüğü süre boyunca varlığını korunur. |
| Depolama | Yerel değişkenler belirtilmedikçe yığın üzerinde saklanır.| Derleyici tarafından belirlenen sabit bir yerde saklanır.|