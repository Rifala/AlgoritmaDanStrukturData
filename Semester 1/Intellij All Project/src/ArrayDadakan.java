import java.util.Scanner;

public class ArrayDadakan {

    public static  String[] namaMHS = new String[10];
    private static void nama (String nama){
            namaMHS[0] = nama;
            namaMHS[1] = nama;
            namaMHS[2] = nama;
            namaMHS[3] = nama;
            namaMHS[4] = nama;
            namaMHS[5] = nama;
            namaMHS[6] = nama;
            namaMHS[7] = nama;
            namaMHS[8] = nama;
            namaMHS[9] = nama;
    }

    private static void inputnama (){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nama: ");
        String masuk = input.nextLine();

        nama(masuk);
//        String pilih = "a";
//        int loop = 0;
//        do {
//            System.out.println("Masukan Nama: ");
//            pilih = input.nextLine().toString();
//
//            loop++;
//
//        }while (pilih != "x");
//
//        nama(inputnama(pilih));

    }

    public static void main(String[] args) {
        inputnama();
    }
}
