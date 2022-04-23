package Model;

import Interfaces.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil){
        hasil = 0;

        this.a = _a;
        this.b = _b;
        this.hasil = _hasil;
        printJudulClass("Print judul dalam Class Perhitungan ");

    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalam Interface");

    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;

    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;

    }

    public int tambah(int _a,int _b){
        HitungTambah();
        return hasil;
    }

    public int kali(int _a,int _b){
        HitungKali();
        return hasil;
    }
}
