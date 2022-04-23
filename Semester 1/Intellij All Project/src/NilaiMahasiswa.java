import Model.Mahasiswa;

import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] myMahasiswa = new Mahasiswa[1];
        int loop = 0;
        System.out.println("Masukan Nilai IPK Mahasiswa");
        System.out.println("-----------------------------");
        for (int counter = 0; counter < myMahasiswa.length; counter++){
            String Nim;
            String Nama;
            String Kelas;
            double Nilai;
            loop++;

            Scanner userInput = new Scanner(System.in);
            System.out.println("\nInput Nim " + loop);
            Nim = userInput.nextLine();

            System.out.println("Masukan Nama Mahasiswa = ");
            Nama = userInput.nextLine();

            System.out.println("Masukan Kelas Mahasiswa = ");
            Kelas = userInput.nextLine();

            System.out.println("Masukan Nilai Mahasiswa = ");
            Nilai = userInput.nextDouble();

            myMahasiswa[counter] = new Mahasiswa(Nim,Nama,Kelas,Nilai);
        }

        System.out.println("\nNama-nama Mahasiswa yang Diinput : ");
        System.out.println("--------------------------------------");
        for (int counter = 0; counter < myMahasiswa.length; counter++){
            myMahasiswa[counter].PrintNilaiIpk();
        }
    }
}
