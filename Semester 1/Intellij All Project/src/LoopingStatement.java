import java.util.Scanner;

public class LoopingStatement {
    public static void main(String[] args) {
        //FOR statement digunakan untuk perulangan dengan batas atas dan bawah yang pasti
        Scanner myNumberLoop = new Scanner(System.in);
        System.out.println("Masukkan Banyaknya Angka Yang akan dilooping = ");
        int loopingNumber = myNumberLoop.nextInt();

        System.out.println("\nLooping menggunakan For...");
        for (int i = 0; i <= loopingNumber; i++){
            System.out.println("Angka i = " + i);
        }

        System.out.println("\nLooping menggunakan while...");
        //Looping dengan While Statement...
        int y;
        y=0;
        do{
            System.out.println("Angka y = " + y);
            y++;
        }while(y<=loopingNumber);
    }
}
