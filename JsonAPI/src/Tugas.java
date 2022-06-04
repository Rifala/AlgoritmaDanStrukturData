public class Tugas {


    private String[] isi;

    public Tugas(){

    }

    public String[] getIsi() {
        return isi;
    }

    public void setIsi(String[] isi) {
        this.isi = isi;
    }

    public void sortData() {
        int lenData = this.isi.length;
        for (int i = 0; i < lenData; i++) {
            for (int j = i + 1; j < lenData; j++) {
                int a = 0;
                if (this.isi[j].toLowerCase().charAt(a) < this.isi[i].toLowerCase().charAt(a)) {
                    String temp = this.isi[i];
                    this.isi[i] = this.isi[j];
                    this.isi[j] = temp;

                    a++;
                    break;
                }
            }
        }
    }

    public void printData(){
        for (String datum : this.isi){
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        int[] s =  new int[] {10,35,32,26,13};
        String[] a = {"Abah","Ningsih","Tatang","Yanto","Albudi"};
        Tugas _myBubble = new Tugas();
        _myBubble.setIsi(a);
        _myBubble.sortData();
        _myBubble.printData();
    }
}
