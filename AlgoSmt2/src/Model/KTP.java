package Model;

public class KTP {
    public String Nama;
    public String Alamat;
    public String Status;
    public String TTL;


   public KTP(){}

    public KTP(String nama, String alamat, String stts, String lahir){
        this.Nama = nama;
        this.Alamat = alamat;
        this.Status = stts;
        this.TTL = lahir;
    }

    public void cetakStatus(String myStatus){
        switch(myStatus){
            case "married":
                System.out.println("Beneran dah nikah?");
                break;
            case "single":
                System.out.println("kapan nikah?");
                break;
            default:
                break;
        }
    }

}
