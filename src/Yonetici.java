
public class Yonetici extends Calisan {
    private int sorumlu_kisi;
    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); 
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı : " + sorumlu_kisi);
    }
    public void zamYap(int zamMiktari){
        System.out.println(getAd() + getSoyad()  +" , çalışanlarına" + zamMiktari + " kadar zam yapmıştır");
    }
    
    
}
