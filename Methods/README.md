# METODLAR

##### Kullanım Amacı
- Programları kategorize etmek için kullanılır.
- Program içerisinde kod karmaşıklığını engellemek için kullanılır.

### Parametresiz Metodlar

> Parametresiz Metodlar değer değil sonuç döndürürler.

```java
public static void main(String[] args) {
        add();

    }
    public static void add(){
        System.out.println("Add Competed!!!");
    }

 }
 
```


### Parametreli Metodlar

> Parametreli Metodlar daima değer döndürürler.
> public static int sum(int number1,int number2)-number1 ve number2 bir Parametredir.

#### Kullanım Amacı
- Her Kod için farklı bir işlem gerçekleştirmek için kullanılır.

```java
public static void main(String[] args) {
        int numberOne=20;
        
        int numberTwo=40;
        
         int resultAddition;
         
         resultAddition=sum(numberOne,numberTwo);
         
           System.out.println("Sum:"+resultAddition);
    }
    public static int sum(int number1,int number2){
        return number1+number2;
    }
 
```
### Variable Argument

> Variable Argument Diziler için kullanılan parametreli metoddur

##### Kullanım Amacı

- Dizilerle ilgili metodlar'ı daha anlaşılır çalıştırmak için kullanılır.


```java
public static void main(String[] args) {
        int result[] = new int[9]={1,2,3,4,5,6,7,8,9,10}

        int resultArray = 0;


        for (int i=0;i<result.length;i++){
            result[i]=keyboard.nextInt();
            resultArray+=numbersAdd(result[i]);

        }
        System.out.println("ResultArray:"+resultArray);
    }
    public static  int numbersAdd(int... numbers){
        int sums=0;
        for (int number:numbers) {
            sums+=number;
        }
        return  sums;
    }
 
```
> Bu Metod Pek Önerilmez
----

Muharrem Koç Java Developer

----


