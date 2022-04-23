import java.util.Scanner;

public class LatihanKelasA {

    public static void CetakKalimat(String[] huruf) {
        for (int i=0;i<huruf.length;i++){
            System.out.println(huruf[i]);
        }
    }

    public static void inputNama(){
        Scanner masuk = new Scanner(System.in);
        String[] tampung = new String[10];

        for (int i=0;i<tampung.length;i++) {
            System.out.print("Masukan Nama : ");
            String input = masuk.nextLine();
            tampung[i] = input;
        }

        CetakKalimat(tampung);
    }

    public static void CetakNama(String[] cetak){
        System.out.println("\n" + "Nama yang telah di inputkan : " );

        for (int a=0;a<cetak.length;a++){
            System.out.println(cetak[a]);
        }
    }

    public static void main(String[] args) {
        String Kalimat[] = {"A","B","C","D"};
        CetakKalimat(Kalimat);

        inputNama();
    }

}
