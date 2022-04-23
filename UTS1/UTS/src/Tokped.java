import Model.Barang;

import java.util.ArrayList;
import java.util.Scanner;

public class Tokped {


    public static void pilihMenu(char pilih) {
        Scanner isi = new Scanner(System.in);
        ArrayList<Barang> keranjng = new ArrayList<>();
        Barang jajanMasuk = new Barang();

        switch (pilih) {
            case 'a' -> {
                System.out.print("Pilih Jajan : ");
                char jajan = isi.next().charAt(0);
                //keranjang(jajan,jajanMasuk);

                switch (jajan) {
                    case '1' -> {
                        System.out.print("Masukan Jumlah : ");
                        int jml = isi.nextInt();
                        jajanMasuk.setNamaBarang("Ciki");
                        jajanMasuk.setHargaBarang(2000);
                        jajanMasuk.setJumlahBarang(jml);
                        keranjng.add(jajanMasuk);
                    }

                    case '2' -> {
                        System.out.print("Masukan Jumlah :");
                        int jml = isi.nextInt();
                        jajanMasuk.setNamaBarang("Chaca");
                        jajanMasuk.setHargaBarang(3000);
                        jajanMasuk.setJumlahBarang(jml);
                        keranjng.add(jajanMasuk);
                    }

                    case '3' -> {
                        System.out.print("Masukan Jumlah : ");
                        int jml = isi.nextInt();
                        jajanMasuk.setNamaBarang("Ollate");
                        jajanMasuk.setHargaBarang(5000);
                        jajanMasuk.setJumlahBarang(jml);
                        keranjng.add(jajanMasuk);
                    }
                }

            }

            case 'b' -> {
                System.out.println("Jajan di keranjang : ");
                for (Barang barang : keranjng) {
                    System.out.println(barang);
                }
            }
        }

    }

//    public static void keranjang(char pilih, Barang jajanMasuk){
//        Scanner isijajan = new Scanner(System.in);
//
//        switch (pilih) {
//            case '1' -> {
//                System.out.print("Masukan Jumlah : ");
//                int jml = isijajan.nextInt();
//                jajanMasuk.setNamaBarang("Ciki");
//                jajanMasuk.setHargaBarang(2000);
//                jajanMasuk.setJumlahBarang(jml);
//                keranjng.add(jajanMasuk);
////                beliBarang(pilihanJajan,jml);
//            }
//
//            case '2' -> {
//                System.out.print("Masukan Jumlah :");
//                int jml = isi.nextInt();
//                jajanMasuk.setNamaBarang("Chaca");
//                jajanMasuk.setHargaBarang(3000);
//                jajanMasuk.setJumlahBarang(jml);
//                keranjng.add(jajanMasuk);
//            }
//
//            case '3' -> {
//                System.out.print("Masukan Jumlah : ");
//                int jml = isi.nextInt();
//                jajanMasuk.setNamaBarang("Ollate");
//                jajanMasuk.setHargaBarang(5000);
//                jajanMasuk.setJumlahBarang(jml);
//                keranjng.add(jajanMasuk);
//            }
//        }
//
//    }

        public static void main(String[]args){

            char pilih = '0';
            do {

                Scanner input = new Scanner(System.in);

                System.out.println();
                System.out.println("-------------------------");
                System.out.println("Selamat Datang di Tokoku");
                System.out.println("Produk :");
                System.out.println("1. Ciki");
                System.out.println("2. Chaca");
                System.out.println("3. Ollate");
                System.out.println("-------------------------");
                System.out.println("Menu : ");
                System.out.println("a. Tambahkan ke keranjang");
                System.out.println("b. Lihat keranjang");
                System.out.println("c. Checkout");
                System.out.print("Pilih : ");
                pilih = input.next().charAt(0);

                pilihMenu(pilih);

            } while (pilih != '9');
        }

    }
