package model;

public class Product {
    private String urunAdi;
    private double urunFiyati;

    public Product(String urunAdi, double urunFiyati) {
        this.urunAdi = urunAdi;
        this.urunFiyati = urunFiyati;

    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public double getUrunFiyati() {
        return urunFiyati;
    }
}
