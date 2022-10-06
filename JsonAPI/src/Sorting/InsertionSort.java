package Sorting;

public class InsertionSort {
    private int[] data;
    private String[] dataNama;

    public void setDataNama(String[] dataNama) {this.dataNama = dataNama;}

    public void setData(int[] data){this.data = data;}



    public void InsertionSortAngka(){
        int size = this.data.length;

        for (int step = 1; step < size; step++){
            int key = this.data[step];
            int j = step - 1;

            while (j >= 0 && key < this.data[j]){
                this.data[j + 1] = this.data[j];
                --j;
            }

            this.data[j + 1] = key;
        }
    }

    public void InsertionSortHrf(){
        int size = this.dataNama.length;

        for (int step = 1; step < size; step++){
            String key = this.dataNama[step];
            int j = step - 1;

            while (j >= 0 && (key.compareTo(this.dataNama[j]) < 0)){
                this.dataNama[j + 1] = this.dataNama[j];
                --j;
            }

            this.dataNama[j + 1] = key;
        }
    }


    public void PrintSort(){
        for (int datum : this.data){
            System.out.println(datum + " ");
        }

        for (String datum : this.dataNama){
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"Windy","Budi","Susi","Agus","Beni"};
        int[] age = {12,7,2,1,0,67,78,95};
        InsertionSort s = new InsertionSort();
        s.setData(age);
        s.setDataNama(nama);
        s.InsertionSortAngka();
        s.InsertionSortHrf();
        s.PrintSort();
    }
}
