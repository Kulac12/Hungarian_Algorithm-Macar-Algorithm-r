# Hungarian_Algorithm-Macar-Algorithm-r
ASSIGNMENT PROBLEMS   There is a special situation in transportation problems that requires each supply point to be assigned to a demand point and each demand to be met. These types of problems are called “assignment problems”. For example, determining which worker or machine will do which job is an assignment problem.

![image](https://github.com/Kulac12/Hungarian_Algorithm-Macar-Algorithm-r/assets/71596094/f6f37b11-c516-45fc-9240-26105f8a66b3)


Örnek 1. Uçuş Ekibi 
(Winston 7.5.’den esinlenilmiştir) 
Dört adet kaptan pilot (P1, P2, P3, P4) uçuşlarda beraber oldukları dört adet uçuş 
teknisyenini (T1, T2, T3, T4) yetkinlik, uyum ve moral motivasyon açısından 1-20 
ölçeğinde değerlendirmişlerdir (1: çok iyi, 20: çok kötü). Değerlendirme notları tabloda 
verilmiştir. Havayolu şirketi her uçuş teknisyeninin kaptan pilotlara atamasını bu 
değerlendirmelere göre yapmak istemektedir. 
 T1 T2 T3 T4 
P1 2 4 6 10 
P2 2 12 6 5 
P3 7 8 3 9 
P4 14 5 8 7 
Yanıt: Adım 1 & 2 Tablodaki her satır için en küçük maliyetler bulunur ve her 
maliyetten kendi satırındaki en küçük maliyet çıkarılır.
 Satır min 
2 4 6 10 2 0 2 4 8 
2 12 6 5 2  0 10 4 3 
7 8 3 9 3 4 5 0 6 
14 5 8 7 5 9 0 3 2
