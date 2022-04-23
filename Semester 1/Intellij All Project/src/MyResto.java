import java.util.Scanner;

public class MyResto {

    public static String[] MyCart = new String[6];

    private static void AddToCart (char order, int index){
        String pilihanMakanan = "";                             //switch case
        switch (order){
            case '1' :
                pilihanMakanan = "Nasi Putih";
                break;
            case '2':
                pilihanMakanan = "Sayur Asam";
                break;
            case '3' :
                pilihanMakanan = "Ayam Goreng";
                break;
            case '4' :
                pilihanMakanan = "Pecak Lele";
                break;
            case '5':
                pilihanMakanan = " Tempe Goreng";
                break;
            case '6' :
                pilihanMakanan = "Ayam Greprek";
                break;
            case '7' :
                pilihanMakanan = "Teh Tawar";
                break;
            case '8' :
                pilihanMakanan = "Es Teh Manis";
                break;
            case '9' :
                pilihanMakanan = "Es Jeruk";
                break;
        }
        MyCart[index] = pilihanMakanan;
    }

    private static void printOrder(String[] keranjang){
        System.out.println("\n Pesanan Anda Adalah :");
        for (int i = 0; i<keranjang.length; i++);
    }


    private static void Load_Menu(){
        String MenuMakanan = "1. Nasi Putih\n2. Sayur Asem\n3.Ayam Goreng\n4.Pecak Lele\n5.Tempe Goreng\n6. Ayam Geprek \n";
        String MenuMinuman = "7. Teh Tawar\n8. Es Teh Manis\n9. Es Jeruk";
        Scanner myInput = new Scanner(System.in);
        char pilih='a';
        int loop = 0;
        do{
            System.out.println("\nMENU MAKANAN");
            System.out.println("-------------------");
            System.out.println(MenuMakanan + "\n");
            System.out.println("MENU  MINUMAN");
            System.out.println("-------------------");
            System.out.println(MenuMinuman);

            System.out.print("\nPilihan Anda ( tekan 'x' untuk mencetak Order / Keluar ) = ");
            pilih = myInput.next().charAt(0);

            AddToCart(pilih,loop);
            loop++;

        }while(pilih!='x');

        printOrder(MyCart);
    }


    public static void main(String[] args) {
        Load_Menu();
    }
}

