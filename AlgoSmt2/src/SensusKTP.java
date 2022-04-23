import Model.KTP;

import java.util.Scanner;

public class SensusKTP {
        public static void main(String[] args) {

            KTP[] ppl = new KTP[3];
            for (int count = 0; count<ppl.length;count++){
                String nama;
                String alamat;
                String stts;
                String lahir;

                Scanner input = new Scanner(System.in);

                System.out.print("Masukkan nama : ");
                nama = input.nextLine();

                System.out.print("Masukkan alamat : ");
                alamat = input.nextLine();

                System.out.print("Masukkan status (married/single) : ");
                stts = input.nextLine();

                System.out.print("Masukkan tempat lahir : ");
                lahir = input.nextLine();

                ppl[count] = new KTP(nama,alamat,stts,lahir);
                ppl[count].cetakStatus(stts);

            }


        }
}
