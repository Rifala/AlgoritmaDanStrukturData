package Sorting;

public class BubbleSort {


    private int[] data;

    public BubbleSort(){

    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public void sortData() {
        int lenData = this.data.length;
        for (int i = 0; i < lenData; i++) {
            for (int j = i + 1; j < lenData; j++) {
                if (this.data[j] < this.data[i]) {
                    int temp = this.data[i];
                    this.data[i] = this.data[j];
                    this.data[j] = temp;
                }
            }
        }
    }

    public void printData(){
        for (int datum : this.data){
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        int[] s =  new int[] {10,35,32,26,13};
        BubbleSort _myBubble = new BubbleSort();
        _myBubble.setData(s);
        _myBubble.sortData();
        _myBubble.printData();
    }
}
