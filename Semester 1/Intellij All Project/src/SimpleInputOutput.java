import java.io.IOException;
import java.util.Scanner;

public class SimpleInputOutput {
    public static void main(String[] args) throws IOException {
        //access I/O using throwException java
        //utuk mengakses IRQ (Interrupt Request) Kode ASCII


        System.out.println("Ketikan Satu Karakter kemudian Tekan ENTER");
        int myInput;
        myInput = System.in.read();
        System.out.println("karakter yang di ketik adalah = " + myInput);


        Scanner inputMe = new Scanner(System.in);
        System.out.println("Masukan Nama Lengkap : ");

        String namaSaya = inputMe.nextLine();
        System.out.println("Nama Saya Adalah = " + namaSaya);
    }
}
