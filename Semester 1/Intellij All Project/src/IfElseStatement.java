import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        //deklarasi Judul/Title dalam bentuk String
        final String title1 = "Perhitungan Grade Nilai Mahasiswa";
        final String title2 = "-------------------------------------";
        final String title3 = "Penilaian";

        Scanner myInput = new Scanner(System.in);
        System.out.println(title1);
        System.out.println(title2);

        System.out.println("Masukkan NIM : ");
        String myNIM = myInput.nextLine();

        System.out.println("Masukkan Nama : ");
        String myNama = myInput.nextLine();

        System.out.println("Masukkan Kelas : ");
        String myClass = myInput.nextLine();

        System.out.println("\n" + title3);
        System.out.println(title2);

        double nilai;
        String textLulus;

        double[] myScore = new double[4];           //deklarasi variabel myScore sebagai Array bertipe Double
        System.out.println("Nilai Algoritma = ");
        nilai = myInput.nextDouble();
        myScore[0] = nilai;                            //memasukan isi dari variabel nilai ke dalam Array myScore indeks 0

        System.out.println("Nilai Sistem Basis Data = ");
        nilai = myInput.nextDouble();
        myScore[1] = nilai;

        System.out.println("Nilai Aljabar Linear = ");
        nilai = myInput.nextDouble();
        myScore[2] = nilai;

        System.out.println("Nilai Math Diskrit = ");
        nilai = myInput.nextDouble();
        myScore[3] = nilai;

        System.out.println("\n Hasil Grade Penilaian");
        System.out.println(title2);

        if (myScore[0] > 70){
            textLulus = "Lulus";
        }else{
            textLulus = "Gagal";
        }
        System.out.println("Nilai Algoritma Anda = " + myScore[0] + " " + textLulus);

        if (myScore[1] > 70){
            textLulus = "Lulus";
        }else{
            textLulus = "Gagal";
        }
        System.out.println("Nilai Sistem Basis Data Anda = " + myScore[1] + " " + textLulus);

        if (myScore[2] > 70){
            textLulus = "Lulus";
        }else{
            textLulus = "Gagal";
        }
        System.out.println("Nilai Aljabar Linear Anda = " + myScore[2] + " " + textLulus);

        if (myScore[3] > 70 ){
            textLulus = "Lulus";
        }else{
            textLulus = "Gagal";
        }
        System.out.println("Nilai Math Diskrit Anda = " + myScore[3] + " " + textLulus);
    }
}
