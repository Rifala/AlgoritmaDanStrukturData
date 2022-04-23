import Model.Post;

import java.util.ArrayList;
import java.util.Scanner;

public class Instagram {

    private static void PrintCommen(){

    }

    public static void comen(){
        String inptUsername;
        String inptKomen;

        ArrayList<Post> komentarAll = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Username : ");
        inptUsername = input.nextLine();
        System.out.println("Masukan Komenmu : ");
        inptKomen = input.nextLine();

        Post komen = new Post(inptUsername,inptKomen);
        komentarAll.add(komen);
    }

    public static void main(String[] args) {
        ArrayList<Post> postingan = new ArrayList<>();

        Post Lulu = new Post("Lulu",21,0);
        postingan.add(Lulu);

        System.out.println();
        System.out.println(Lulu.getUsername());
        System.out.println("---------------------");
        System.out.println();
        System.out.println();
        System.out.println("Postingan Lulu");
        System.out.println();
        System.out.println();
        System.out.println("---------------------");
        System.out.println(Lulu.getLike()+" suka");
        System.out.println(Lulu.getJmlcommen()+" commen");
        System.out.println();

        char pilihMenu = 0;
        int loop = 0;
        while(pilihMenu != 4){
            int likeSekarang = Lulu.getLike();
            int jumlahkomenSekarang = Lulu.getJmlcommen();

            Scanner pilihanmenu = new Scanner(System.in);
            System.out.println("Menu : ");
            System.out.println("1. Like postingan ini");
            System.out.println("2. Komentari postingan ini");
            System.out.println("3. Lihat komentar");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda : ");
            pilihMenu = pilihanmenu.next().charAt(0);

            switch (pilihMenu) {
                case '1' -> {  likeSekarang = Lulu.likeNambah(likeSekarang);
                    System.out.println();
                    System.out.println(Lulu.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Lulu");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(likeSekarang+" suka");
                    System.out.println(Lulu.getJmlcommen()+" commen");
                    System.out.println();
                }

                case '2' -> {comen();
                    jumlahkomenSekarang = Lulu.comenNambah(jumlahkomenSekarang);
                    System.out.println();
                    System.out.println(Lulu.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Lulu");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(likeSekarang+" suka");
                    System.out.println(jumlahkomenSekarang+" commen");
                    System.out.println();
                }

                case '3' -> {
                    System.out.println();
                    System.out.println(Lulu.getUsername());
                    System.out.println("---------------------");
                    System.out.println();
                    System.out.println();
                    System.out.println("Postingan Lulu");
                    System.out.println();
                    System.out.println();
                    System.out.println("---------------------");
                    System.out.println(likeSekarang+" suka");
                    System.out.println(jumlahkomenSekarang+" commen");
                    System.out.println();
                    PrintCommen();
                }

                default -> {

                }
            }

            loop++;

        }


    }
}
