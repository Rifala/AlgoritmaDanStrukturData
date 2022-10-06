package ECommerce;



public class Shopper {
    public String _pluCode;
    public String _pluName;
    public String _description;
    public int _price;
    public String _size;
    public String _filename;



    public String get_pluCode() {
        return _pluCode;
    }

    public void set_pluCode(String _pluCode) {

        this._pluCode = _pluCode;
    }

    public String get_pluName() {

        return _pluName;
    }

    public void set_pluName(String _pluName) {
        this._pluName = _pluName;
    }

    public String get_description() {

        return _description;
    }

    public void set_description(String _description) {

        this._description = _description;
    }

    public int get_price() {

        return _price;
    }

    public void set_price(int _price) {

        this._price = _price;
    }

    public String get_size() {

        return _size;
    }

    public void set_size(String _size) {

        this._size = _size;
    }

    public String get_filename() {

        return _filename;
    }

    public void set_filename(String _filename) {

        this._filename = _filename;
    }

    public Shopper(){

    }

//    public int partition (int start, int end){
//        int pivot = this.get_pluCode().indexOf(end);
//        int i = (start - 1);
//        for (int j = start; j <= end - 1; j++){
//            if (this.get_pluCode().indexOf(j) < pivot){
//                i++;
//                int t = this.get_pluCode().indexOf(i);
//                this.get_pluCode().indexOf(i) = this.get_pluCode().indexOf(j);
//                this.get_pluCode().indexOf(j) = t;
//            }
//        }
//
//        int t = this.get_pluCode().indexOf(i+1);
//        this.get_pluCode().indexOf(i+1) = this.get_pluCode().indexOf(end);
//        this.get_pluCode().indexOf(end) = t;
//        return (i + 1);
//    }
//
//    public void quickSort(int start, int end){
//        if (start < end){
//            int p = partition(start,end);
//            quickSort(start, p - 1);
//            quickSort(p + 1, end);
//        }
//    }
//
//    public void printArr(int n){
//        int i;
//        for (i = 0; i < n; i++){
//            System.out.println(this.get_pluCode().indexOf(i) + " ");
//        }
//    }




}
