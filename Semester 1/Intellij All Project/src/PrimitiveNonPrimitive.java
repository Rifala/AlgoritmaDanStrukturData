public class PrimitiveNonPrimitive {
    private static class Ary{
        private int number1;
        private int number2;

        private int CalculateNumber () { return number1*number2; }
        }

    public static void main(String[] args) {
        int angka1;
        int angka2;
        int jumlahAngka;

        angka1 = 20;
        angka2 = 40;

        jumlahAngka = angka1 + angka2;
        System.out.println("Jumlahnya Adalah = " + jumlahAngka);

        double angkaPecahan1;
        double angkaPecahan2;
        double jumlahPecahan;

        angkaPecahan1 = 20.4;
        angkaPecahan2 = 80.6;

        jumlahPecahan = angkaPecahan1 + angkaPecahan2;
        System.out.println("Jumlah Angka Pecahan adalah = " + jumlahPecahan);

        float angkaFloat1;
        float angkaFloat2;
        float jumlahFloat;

        angkaFloat1 = 46.7f;
        angkaFloat2 = 78.3f;

        jumlahFloat = angkaFloat1 + angkaFloat2;
        System.out.println("Jumlah Angka Float adalah = " + jumlahFloat);

        Ary perkalianAngka;
        perkalianAngka = new Ary();

        perkalianAngka.number1 = 5;
        perkalianAngka.number2 = 6;

        int hasilPerkalian;
        hasilPerkalian = perkalianAngka.CalculateNumber();

        System.out.println("Hasil Perkalian dari Data Type Non Primitive = " + hasilPerkalian);

        }
    }


