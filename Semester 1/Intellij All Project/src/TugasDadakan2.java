
public class TugasDadakan2 {

    public static void main(String[] args) {
        int wadah[];
        wadah = ganjilgenap();
        output(wadah);
    }

//    private static int ganjilgenap(int angka){
//        if (angka % 2 == 0 ){
//            angka
//        }
//        return angka;
//    }

    private static boolean TrueFalse(int angka){
        if(angka % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    private static int[] ganjilgenap() {
        int myNumber [];
        myNumber = new int[100];

        for (int i = 1; i <= 100; i++) {
            boolean genap = TrueFalse(i);
            if (genap){

            }
        }
        return myNumber;
    }

    private static void output(int[] number){
        for (int s = 1; s < number.length; s++){
            System.out.println("Angka Genap, yaitu : " + number[s]);
        }
    }

}
