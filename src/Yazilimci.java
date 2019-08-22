
public class Yazilimci extends Calisan{
    
    private String diller;
    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster();
        
        System.out.println("Bildiği diller : " + diller);
    }
    
    public void formatAt(String isletim_sistemi){
        
        System.out.println(getAd() + getSoyad() + isletim_sistemi +"'ne format atıyor..  ");
                
    }
    
}
