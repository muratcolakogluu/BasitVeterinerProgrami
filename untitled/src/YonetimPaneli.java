public class YonetimPaneli<T> {

    // Her türlü nesnenin toString verisini basar
    public void bilgileriGoster(T nesne) {
        System.out.println("--- Panel Bilgisi ---");
        System.out.println(nesne);
    }

    // Sadece Musteri ve alt sınıflarını kabul eder, casting gerekmez
    public <X extends Musteri> void sahipOlduguHayvanlariGoster(X musteri) {
        System.out.println("--- Müşterinin Hayvanları ---");
        musteri.musteriHayvanlariListele();
    }

    // Sadece Veteriner ve alt sınıflarını kabul eder
    public <X extends Veteriner> void veterinerMusterileriniListele(X veteriner) {
        System.out.println("--- Veterinerin Müşteri Listesi ---");
        veteriner.musteriListele();
    }
}