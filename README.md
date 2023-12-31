# Hungarian_Algorithm-Macar-Algorithm-r
ASSIGNMENT PROBLEMS   There is a special situation in transportation problems that requires each supply point to be assigned to a demand point and each demand to be met. These types of problems are called “assignment problems”. For example, determining which worker or machine will do which job is an assignment problem.

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/f6f37b11-c516-45fc-9240-26105f8a66b3)


## Örnek 1. Uçuş Ekibi 
(Winston 7.5.’den esinlenilmiştir) 
Dört adet kaptan pilot (P1, P2, P3, P4) uçuşlarda beraber oldukları dört adet uçuş 
teknisyenini (T1, T2, T3, T4) yetkinlik, uyum ve moral motivasyon açısından 1-20 
ölçeğinde değerlendirmişlerdir (1: çok iyi, 20: çok kötü). Değerlendirme notları tabloda 
verilmiştir. Havayolu şirketi her uçuş teknisyeninin kaptan pilotlara atamasını bu 
değerlendirmelere göre yapmak istemektedir. 

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/f3c0402a-6397-48c9-805e-32c78b685744)

## Yanıt: Adım 1 & 2 
Tablodaki her satır için en küçük maliyetler bulunur ve her 
maliyetten kendi satırındaki en küçük maliyet çıkarılır.

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/3eb3883d-011a-4c70-ae58-1d62a99842ea)

## Adım 3 & 4.
Yeni matrisin her sütunun en küçük maliyeti bulunur. Her maliyetten kendi 
sütunundaki en küçük maliyeti çıkararak indirgenmiş maliyet matrisi elde edilir. 

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/ecf48979-abe0-4ddb-b2cb-c8cd01c91457)

## Adım 5.
Aşağıdaki tabloda gösterildiği gibi 3. ve 4. satır ile 1. sütunda çizilecek çizgiler 
indirgenmiş maliyet matrisindeki tüm sıfırları örter. Gerekli en az çizgi sayısı 3’dür. 
4’den az çizgi gerektiğinden çözüm en iyi değildir. Bir sonraki adıma geçilir. 

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/db576d49-67f9-4708-b6d3-5729c686cec8)

## Adım 6 & 7.
. Örtülememiş en küçük maliyet 1’dir. Her örtülmemiş maliyetten 1 çıkarılır 
ve iki çizgi ile örtülenlere 1 eklenir. 

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/e03a556f-f1da-4253-9136-e785602bd2a3)

Yeni tabloda tüm sıfırları dörtten daha az çizgi ile örtmek mümkün değildir. En iyi 
çözüm bulunmuştur. 
Sütun 3’deki tek sıfır x33’de ve Sütun 2’deki tek sıfır x42’dedir. Satır 4 tekrar 
kullanılmayacağı için Sütun 4 için kalan sıfır x24’dedir. Son olarak x11’i seçeriz. Seçilen 
tüm karar değişkenleri 1’e eşittir.

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/b1a51f9d-4e91-4928-a805-d23a8e46c243)

