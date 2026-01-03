import java.util.ArrayList;
public class Musteri extends Kisi{
    private String adres;
    private String telefon;
    private ArrayList<Hayvan> musteriHayvanlari;

    public Musteri(String isim, String tcKimlik, String adres, String telefon) {
        super(isim, tcKimlik);
        this.adres = adres;
        this.telefon = telefon;
        musteriHayvanlari=new ArrayList<>();
    }

    public ArrayList<Hayvan> getMusteriHayvanlari() {
        return musteriHayvanlari;
    }
    public void musteriyeHayvanEkle(Hayvan hayvan){
        musteriHayvanlari.add(hayvan);
        System.out.println(hayvan+" "+ getIsim()+" Müsterisine eklendi.");
    }

    public void setMusteriHayvanlari(ArrayList<Hayvan> musteriHayvanlari) {
        this.musteriHayvanlari = musteriHayvanlari;
    }
    public void musteriHayvanlariListele() {
        for (Hayvan h : musteriHayvanlari) {
            System.out.println(h);
        }
    }

    @Override
    void kendiniTanit() {
        System.out.println(toString()+" Ben bir müşteriyim");
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return super.toString()+  "Musteri{" +
                "adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}


