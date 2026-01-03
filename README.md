#  Veteriner Birliği Yönetim Sistemi

Bu proje, bir veteriner kliniğinin temel işleyişini (Müşteri, Veteriner, Hayvan ve Şehir yönetimi) modelleyen, Java'nın Nesne Yönelimli Programlama (OOP) prensipleri ve Generic yapılar kullanılarak geliştirilmiş bir yönetim sistemidir.

##  Özellikler

- **Hiyerarşik Yapı:** `Kisi` ve `Hayvan` soyut sınıfları (abstract) üzerine kurulu genişletilebilir mimari.
- **Müşteri & Hayvan İlişkisi:** Her müşterinin kendine ait bir hayvan listesi tutulmaktadır.
- **Veteriner Yönetimi:** Veterinerlerin mezuniyet bilgileri, çalışma süreleri ve sorumlu oldukları müşteri listeleri yönetilir.
- **Şehir Bazlı Organizasyon:** Veterinerlerin şehirlere göre gruplanması ve istatistiklerinin tutulması.
- **Generic Yönetim Paneli:** Farklı türdeki nesneleri tek bir panel üzerinden yönetmeyi sağlayan tip güvenli (Generic) yapı.

##  Kullanılan Teknolojiler ve Kavramlar

Bu proje geliştirilirken aşağıdaki Java konseptleri uygulanmıştır:
- **Abstraction (Soyutlama):** Karmaşıklığı azaltmak için abstract class ve metod kullanımı.
- **Inheritance (Kalıtım):** Sınıflar arası hiyerarşi ve kod tekrarının önlenmesi.
- **Polymorphism (Çok Biçimlilik):** Alt sınıfların üst sınıf referansıyla yönetilmesi.
- **Generics:** Tip güvenli listeleme ve yönetim paneli işlemleri.
- **Collections Framework:** Dinamik veri yönetimi için `ArrayList` kullanımı.
- **Encapsulation (Kapsülleme):** Veri güvenliği için private alanlar ve getter/setter metodları.

##  Proje Yapısı

```text
src/bolum11/VeterinerBirliği/
├── Hayvan.java (Abstract)
├── Kedi.java
├── Kopek.java
├── Kisi.java (Abstract)
├── Musteri.java
├── Veteriner.java
├── SehirVeterinerlikleri.java
├── YonetimPaneli.java (Generic)
└── Main.java

Nasıl Çalıştırılır?
projeyi bilgisayarınıza clonelayın:

Bash

git clone [https://github.com/kullaniciadi/proje-adi.git](https://github.com/kullaniciadi/proje-adi.git)
