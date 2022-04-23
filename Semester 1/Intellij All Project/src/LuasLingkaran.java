import java.util.Scanner;

public class LuasLingkaran {
    public static void luasLingkaran() {
        Scanner input;
        input = new Scanner(System.in);
        System.out.print("Masukan Jari-jari = ");
        double jariJari = input.nextDouble();

        double luas;
        luas = Math.PI * jariJari * jariJari;
        System.out.println("Luas Lingkarannya adalah " + luas);
    }

    public static void main(String[] args) {

        luasLingkaran();

    }
}
