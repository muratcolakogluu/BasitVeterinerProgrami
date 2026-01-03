import java.util.ArrayList;

public class Veteriner extends Kisi{
    private String MezunOlduguOkul;
    private int calismaSuresi;
    private ArrayList<Musteri> veterinerMusterileri;
    private int musteriSayisi;


    public Veteriner(String isim, String tcKimlik, String mezunOlduguOkul, int calismaSuresi) {
        super(isim, tcKimlik);
        MezunOlduguOkul = mezunOlduguOkul;
        this.calismaSuresi = calismaSuresi;
        veterinerMusterileri=new ArrayList<>();
        musteriSayisi=0;
    }
    public void musteriListele(){
        for(Musteri m:veterinerMusterileri){
            m.kendiniTanit();
        }
    }
    public void musteriEkle(Musteri musteri){
        veterinerMusterileri.add(musteri);
        musteriSayisi++;
        System.out.println(musteri+": basariyla müsteri listenize eklendi.");
    }


    @Override
    void kendiniTanit() {
        System.out.println(toString()+"Ben bir veterinerim");
    }

    @Override
    public String toString() {
        return super.toString()+ "Veteriner{" +
                "MezunOlduguOkul='" + MezunOlduguOkul + '\'' +
                ", calismaSuresi=" + calismaSuresi +
                '}';
    }
}
