import java.util.Scanner;

public class TugasDadakan {
    private static boolean GanjilGenap(int number){
        if (number % 2 == 0){
            return true;                     //karena GanjilGenap tipe boleean jadi hasilnya true/false
        }else{                               //Jika sudah diidentifikasi true/false akan dijalankan showme
            return false;                    //pada showme jika hasil pada GanjilGenap true akan dimasukkan ke if(true)
        }                                    //jika false akan dimasukkan ke else
    }

    private static void ShowMe(int angka){
        boolean ganjilgenap;                        //tipe datanya harus sama dengan tipe data method yang dipanggil
        ganjilgenap = GanjilGenap(angka);           //memanggil method GanjilGenap
        if (ganjilgenap){
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }
    }

    private static void PleaseInput(){
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int inputAngka = input.nextInt();

        //memanggil method ShowMe
        ShowMe(inputAngka);
    }

    public static void main(String[] args) {
    PleaseInput();
    }
}
