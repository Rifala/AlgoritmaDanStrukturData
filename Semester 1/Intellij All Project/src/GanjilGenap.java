import java.util.Scanner;

public class GanjilGenap {

    //program ganjil genap menggunakan method
    public static void GanjilGenap(){
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int inputAngka = input.nextInt();

        if (inputAngka % 2 == 0){
            System.out.println("Angka " + inputAngka + " merupakan angka genap");
        }else{
            System.out.println("Angka " + inputAngka + " merupakan angka ganjil");
        }
    }

    public static void main(String[] args) {
        GanjilGenap();
    }
}
