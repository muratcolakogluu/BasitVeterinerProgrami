public class Main {
    private static void ilkNesneleriOlustur() {
        Kedi kedi=new Kedi("01-01-2026",true,"Van Kedisi");
        kedi.bilgileriGoster();

        Kopek kopek=new Kopek("01-02-2025",true,"Golden",5);
        kopek.bilgileriGoster();

        Musteri musteri=new Musteri("Murat","11111111111","Bursa/Karacabey","05555555555");
        musteri.kendiniTanit();
        musteri.musteriyeHayvanEkle(kedi);

        Veteriner veteriner=new Veteriner("Dursun","111111111","MAKÜ",4);
        veteriner.kendiniTanit();
        veteriner.musteriEkle(musteri);
        veteriner.musteriListele();

        SehirVeterinerlikleri bursa=new SehirVeterinerlikleri("Bursa");
        bursa.sehireVeterinerEkle(veteriner);
        bursa.sehirdekiVeterinerSayisi();

        YonetimPaneli<Hayvan> hayvanYonetimPaneli=new YonetimPaneli<>();
        System.out.println("Yonetim Paneli");
        hayvanYonetimPaneli.bilgileriGoster(kedi);
        hayvanYonetimPaneli.bilgileriGoster(kopek);

        YonetimPaneli<Musteri> musteriYonetimPaneli=new YonetimPaneli<>();
        System.out.println("Yonetim Paneli");
        musteriYonetimPaneli.bilgileriGoster(musteri);

    }


    public static void main(String[] args){
        ilkNesneleriOlustur();


    }
}

