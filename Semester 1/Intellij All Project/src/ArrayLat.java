import java.util.Scanner;

public class ArrayLat {

    public static void main(String[] args) {
        int ArrayNumber[];
        ArrayNumber = inputArrayNumber();
        PrintNumberInput(ArrayNumber);
    }

    private static int[] inputArrayNumber(){
        int myNumber[];
        myNumber = new int[5];

        Scanner inputAngka = new Scanner(System.in);
        for (int index = 0; index < myNumber.length; index++){                  //hasil looping ini akan dimasukkan ke ArrayNumber sehingga ArrayNumber akan memiliki Array dari inputArrayNumber
            System.out.print("Masukan Angka " + index + " = ");
            int myNumberInput = inputAngka.nextInt();
            myNumber[index] = myNumberInput;
        }
        return myNumber;                                                       //return ditulis saat di method mempunyai variabel
    }

    private static void PrintNumberInput(int[] Angka){
        for (int i = 0; i < Angka.length; i++){
            System.out.println("Index ke-" + i + " Berisi = " + Angka[i]);
        }
    }
}
