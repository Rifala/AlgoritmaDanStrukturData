import Model.BumbuKuning;

public class MakananBumbuKuning {
    public static void main(String[] args) throws InterruptedException {

        BumbuKuning Soto = new BumbuKuning("1kg","2kg","3kg","4kg","5kg");
        System.out.println("Soto : ");
        Soto.RacikBumbuKuning("Soto",10);

        BumbuKuning AyamGorengKuning = new BumbuKuning("5kg","4kg","3kg","2kg","1kg");
        System.out.println("Ayam Goreng Kuning :");
        AyamGorengKuning.RacikBumbuKuning("Ayam Goreng Kuning", 12);

        BumbuKuning GulaiKambing = new BumbuKuning("1kg","2kg","3kg","4kg","5kg");
        System.out.println("Gulai Kambing :");
        GulaiKambing.RacikBumbuKuning("Gulai Kambing",8);

        BumbuKuning SateKuning = new BumbuKuning();
        SateKuning.RacikBumbuKuning("Sate Ayam", 15);
    }
}
