import java.util.ArrayList;
public class SehirVeterinerlikleri {
    private String sehir;
    private ArrayList<Veteriner> sehirdekiVeterinerler;
    private int toplamVeteriner=0;

    public SehirVeterinerlikleri(String sehir) {
        this.sehir = sehir;
        sehirdekiVeterinerler=new ArrayList<>();toplamVeteriner=0;
    }
    public void sehireVeterinerEkle(Veteriner veteriner){
        sehirdekiVeterinerler.add(veteriner);
        toplamVeteriner++;
    }
    public void sehirdekiVeterinerSayisi(){
        System.out.println("Toplam veteriner sayisi: "+toplamVeteriner);
    }
}


