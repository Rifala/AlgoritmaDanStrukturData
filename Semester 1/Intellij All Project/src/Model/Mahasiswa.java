package Model;

public class Mahasiswa {
    private String Mahasiswa_nim;
    private String Mahasiswa_nama;
    private String Mahasiswa_kelas;
    private double Mahasiswa_nilai;

    public Mahasiswa(String nim, String nama, String kelas, double nilai){
        this.Mahasiswa_nim = nim;
        this.Mahasiswa_nama = nama;
        this.Mahasiswa_kelas = kelas;
        this.Mahasiswa_nilai = nilai;
    }
    public void PrintNilaiIpk(){
        System.out.println("Nim Mahasiswa = " + this.Mahasiswa_nim + "\n" +
                "Nama Mahasiswa = " + this.Mahasiswa_nama + "\n" +
                "Kelas Mahasiswa = " + this.Mahasiswa_kelas + "\n" +
                "Nilai Mahasiswa = " + this.Mahasiswa_nilai + "\n");
    }
}
