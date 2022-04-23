package Model;

import java.util.concurrent.TimeUnit;

public class BumbuKuning {
    private String Bumbu_Bawang;
    private String Bumbu_Kemiri;
    private String Bumbu_Kunyit;
    private String Bumbu_Jahe;
    private String Bumbu_Garam;

    public BumbuKuning(String bawang, String kemiri, String kunyit, String jahe, String garam){
        this.Bumbu_Bawang = bawang;
        this.Bumbu_Kemiri = kemiri;
        this.Bumbu_Kunyit = kunyit;
        this.Bumbu_Jahe = jahe;
        this.Bumbu_Garam = garam;
    }

    public BumbuKuning(){
        this.Bumbu_Bawang = "5 buah";
        this.Bumbu_Kemiri = "2 buah";
        this.Bumbu_Kunyit = "1 buah";
        this.Bumbu_Jahe = "1/2 buah";
        this.Bumbu_Garam = "500 gram";
    }

    public void RacikBumbuKuning(String makanan, int durasi) throws InterruptedException {
        System.out.println(makanan + " anda akan siap dalam " + durasi + " menit");
        System.out.println("Silahkan Menunggu . . . .");

        for (int hitung = durasi; hitung > 0; hitung--){
            System.out.println(hitung);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Masakan anda telah siap");

//        System.out.println("Bawang = " + this.Bumbu_Bawang + "\n" +
//                "Kemiri = " + this.Bumbu_Kemiri + "\n" +
//                "Kunyit = " + this.Bumbu_Kunyit + "\n" +
//                "Jahe = " + this.Bumbu_Jahe + "\n" +
//                "Garam = " + this.Bumbu_Garam + "\n");
    }
}


