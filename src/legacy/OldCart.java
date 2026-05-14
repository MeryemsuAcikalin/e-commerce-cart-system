package legacy;

import java.util.ArrayList;
import java.util.List;

public class OldCart {

    private List<String> urunAdlari = new ArrayList<>();
    private List<Double> urunFiyatlari = new ArrayList<>();

    public void urunEkle(String urunAdi, double urunFiyati) {
        urunAdlari.add(urunAdi);
        urunFiyatlari.add(urunFiyati);

    }

    public double odenecekTutar(String indirimTuru) {
        double tutar = 0;

        for (double fiyat : urunFiyatlari) {
            tutar += fiyat;
        }

        if (indirimTuru.equals("Ogrenci")) {
            tutar = tutar - (tutar * 0.25);
        } else if (indirimTuru.equals("Yilbasi")) {
            tutar = tutar - (tutar * 0.15);
        } else if (indirimTuru.equals("Haftasonu")) {
            tutar = tutar - (tutar * 0.06);
        }

        return tutar;

    }

    public void sepetGoruntule() {

        for (int i = 0; i < urunAdlari.size(); i++) {
            System.out.println(urunAdlari.get(i) + " : " + urunFiyatlari.get(i));
        }

    }

}
