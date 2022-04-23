public class MethodParameterReturn {
    public static double LuasPersegiPanjang(double p, double l){
        return p*l;
    }

    public static void main(String[] args) {
        double hitungLuas;
        hitungLuas = LuasPersegiPanjang(38,5);
        System.out.println("Luas Persegi Panjang adahal = " + hitungLuas);
    }
}
