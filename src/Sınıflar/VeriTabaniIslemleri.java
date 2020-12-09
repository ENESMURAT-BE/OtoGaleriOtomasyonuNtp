package Sınıflar;
import java.sql.*;

public class VeriTabaniIslemleri {
    String VeriTabanıAdres="jdbc:sqlite:OtoGaleriOtomasyonu.db";
    public Connection Baglan(){
        Connection baglantı=null;
        try{
            baglantı=DriverManager.getConnection("jdbc:sqlite:\\NtpProje\\src\\Veri Tabanı\\OtoGaleriOtomasyonu.db");
            System.out.println("Bağlantı Başarılı");

        }catch (Exception e){
            System.out.println("Bağlantı Başarısız");
        }
        return baglantı;
    }
    public void VerileriEkle(){
        String sorgu ="select * from Araba";
        try(Connection baglantı=this.Baglan(); PreparedStatement islemler = baglantı.prepareStatement(sorgu)){
            System.out.println(islemler.getMetaData().getColumnType(1));
        }catch (Exception e){
            System.out.println("İşlem Yapılamadı");
        }
    }
    public void VerileriGetir(){
        String sorgu ="SELECT araba_id,Marka,Seri from Araba";
        try(Connection baglantı=this.Baglan(); PreparedStatement islemler = baglantı.prepareStatement(sorgu); ResultSet GelenVeriler=islemler.executeQuery()){
            while (GelenVeriler.next()){
                System.out.println("Araba İD: "+GelenVeriler.getString("araba_id")+" Marka:"
                        +GelenVeriler.getString("Marka")+" Seri:"+GelenVeriler.getString("Seri")+".");
            }

        }



        catch (Exception e){
            System.out.println("İşlem Yapılamadı"+ e.getMessage());
        }
    }
}
