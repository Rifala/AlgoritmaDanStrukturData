import ECommerce.Shopper;
import network.ConnectURI;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

public class uas {

    private ArrayList<Shopper> getProduct() throws IOException {
        URL sMe = ConnectURI.buildURL("https://java-api.mimoapps.xyz/getproducts.php");
        String productsResponse = ConnectURI.getResponseFromHttpUrl(sMe);
        assert productsResponse != null;
        JSONArray productsJSONArray = new JSONArray(productsResponse);

        ArrayList<Shopper> productList = new ArrayList<>();
        for (int index = 0; index < productsJSONArray.length(); index++) {
            Shopper productsModel = new Shopper();
            JSONObject myJSONOBject = productsJSONArray.getJSONObject(index);
            productsModel.set_pluCode(myJSONOBject.getString("plucode"));
            productsModel.set_pluName(myJSONOBject.getString("pluname"));
            productsModel.set_size(myJSONOBject.getString("plusize"));
            productsModel.set_price(myJSONOBject.getInt("pluprice"));
            productsModel.set_description(myJSONOBject.getString("pludesc"));
            productsModel.set_filename(myJSONOBject.getString("filename"));
            productList.add(productsModel);
        }

        return productList;
    }

    public int partition (ArrayList<Shopper> list,int start, int end) throws IOException {
        Shopper tes = new Shopper();
        int pivot = list.indexOf(end);
        int i = (start - 1);
        for (int j = start; j <= end - 1; j++){
            if (tes.get_pluCode().indexOf(j) < pivot){
                i++;

                Collections.swap(list,i,j);
//                int t = tes.get_pluCode().indexOf(i);
//                list.indexOf(i) = tes.get_pluCode().indexOf(j);
//                list.indexOf(j) = t;
            }
        }

        Collections.swap(list,i+1,end);
//        int t = getProduct().indexOf(i+1);
//        list.indexOf(i+1) = tes.get_pluCode().indexOf(end);
//        list.indexOf(end) = t;
        return (i + 1);
    }


    public void quickSort(int start, int end) throws IOException {
        ArrayList<Shopper> list = getProduct();
        if (start < end){
            int p = partition(list,start,end);
            quickSort(start, p - 1);
            quickSort(p + 1, end);
        }
    }

    public void printArr(int n) throws IOException {
        int i;
        for (i = 0; i < n; i++){
            System.out.println(getProduct().indexOf(i) + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        Shopper z = new Shopper();
//        int n = z.get_pluCode().length();
        System.out.println("""
                Before Sorting array elements are -\s
                """);
//        int code = Integer.parseInt(z._pluCode);

        uas s = new uas();
        int n = s.getProduct().size();
        s.printArr(n);
        s.quickSort(n, n-1);
//        z.printArr(n);
//        z.quickSort(0,n-1);
        System.out.println("\nAfter sorting array elements are - ");
//        z.printArr(n);
        s.printArr(n);
        System.out.println();
    }
}
