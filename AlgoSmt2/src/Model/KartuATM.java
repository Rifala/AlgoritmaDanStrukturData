package Model;

public class KartuATM{
    public String nomer;
    public String norek;
    public String nama;
    public String nama_bank;
    private int saldo;

    public KartuATM(String no, String nor, String nm, String nmbk){
        this.nomer = no;
        this.norek = nor;
        this.nama = nm;
        this.nama_bank = nmbk;
        this.saldo = 0;
    }

    public int Deposit(int jumlah){
        saldo = saldo + jumlah;
        return saldo;
    }

    public int Withdraw(int jumlah){
        saldo = saldo - jumlah;
        return saldo;
    }
}