import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");
        int angka = input.nextInt();


        int i;
        int m = 0;
        int flag = 0;
        m = angka / 2;
        if(angka == 0 || angka == 1) {
            System.out.println("Bilangan " + angka + " bukan bilangan Prima");
        }else{
            for(i = 2; i <= m; i++) {
                if(angka % i == 0) {
                    System.out.println("Bilangan " + angka + " bukan bilangan Prima");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Bilangan " + angka + " merupakan bilangan Prima");
            }
        }
    }
}
