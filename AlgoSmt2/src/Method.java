public class Method {

    public static void HitungJumlah(){
        int angka1 = 6;
        int angka2 = 10;
        int jumlah = 0;
        jumlah = angka1 + angka2;

        System.out.println("Jumlah = " + jumlah);
    }

    private static void HitungJumlah(int a, int b){
        int jumlah = a + b;
        System.out.println("Jumlah = " + jumlah);
    }

    public static void main(String[] args) {
        int angka1 = 4;
        int angka2 = 6;
        int jumlah = 0;
        jumlah = angka1 + angka2;

        System.out.println("Jumlah = " + jumlah);

        HitungJumlah();
        HitungJumlah(12,3);
    }
    
}
