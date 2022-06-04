public class ArrayMatrix {

    public static void main(String[] args) {

        //array dimension
        int[] angka = {1,2,3,4,5,6,7,8};   //matrix 1xm

        //print element inside angka
        for (int i = 0; i < angka.length; i++){
            System.out.println(angka[i]);
        }

        //array 2D
        System.out.println("\nCetak Array 2D");
        System.out.println("---------------------");
        int[][] angka2D = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        for (int baris = 0; baris < 3; baris++){            //baris < panjang baris
            for (int kolom = 0; kolom < 3; kolom++){
                System.out.print(angka2D[baris][kolom] + " ");
            }

            System.out.println("  ");
        }
    }
}
