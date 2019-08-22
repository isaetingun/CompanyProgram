
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz..");
        String islemler = "İşlemler.\n"
                            +"1. Yazılımcı işlemleri\n"
                            +"2. Yönetici işlemleri\n"
                            +"Çıkmak için q'ya basınız.";
        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        
        while(true){
            System.out.println("İşlem seçiniz :");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor..");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Isa", "Etingun", 113, "Java , Sql");
                String yazilimci_islem = "Yazılımcı işlemleri\n"
                                +"1. Format At\n"
                                +"2. Bilgileri Göster\n"
                                +"Çıkmak için q'ya basınız..";
                System.out.println(yazilimci_islem);
                System.out.println("***********************");
                
                while(true){
                    System.out.println("İşlem Seçiniz : ");
                    String y_islem = scanner.nextLine();
                    if(y_islem.equals("q")){
                        
                    
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("İşletim Sistemi");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgilerigoster();
                    }
                    else {
                        System.out.println("Yazılımcı Geçersiz İşlem");
                    }
                    
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Cem", "Kalkan", 110, 20);
                String yonetici_islem = "İşlemler.\n"
                                    +"1. Zam Yapma.\n"
                                    +"2. Bilgileri Göster\n"
                                    +"Çıkmak için q'ya basınız..";
                
                System.out.println(yonetici_islem);
                System.out.println("*******************************");
                
                while(true){
                    System.out.println("İşlem seçiniz");
                    String yon_islem = scanner.nextLine();
                    
                    if(yon_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor..");
                        break;
                                
                    }
                    else if(yon_islem.equals("1")){
                        System.out.println("Ne kadar zam yapmak istiyorsunuz ?");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if(yon_islem.equals("2")){
                        
                        yonetici.bilgilerigoster();
                    }
                    else{
                        System.out.println("Yönetici Geçersiz İşlem...");
                                
                    }
                    
                }
                
                
                
            }
            else {
                System.out.println("Geçersiz işlem");
            }
            
        }
    }
    
}
