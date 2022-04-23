import java.util.Scanner;

public class SearchNameRecursive{
    static int index = 0;
    static String status;
    static void FindName(String searchtext, String[] data){
            if(index < data.length){
                if(data[index].equals(searchtext)){             //menggunakan .equals(searchtext) karena jika menggunakan == searchtext akan eror/syntax salah
                    status = "Data Match";
                    System.out.println(searchtext + " is on position index = " + index + " of array " + data[index] + " " + status);
                    System.exit(0);             
                }else{
                    if(index < data.length){
                        index++;
                        FindName(searchtext, data);
                        status = "Not Match";
                        System.out.println(searchtext + " " + status);
                        System.exit(0);             //agar keluar jd ngga keulang keatas kalo bener
                    }
                }
            }
    }


    static String inputName(){
        try{
            String name;
            Scanner nameInput = new Scanner(System.in);
            System.out.print("Masukkan Nama Yang Dicari = ");
            name = nameInput.nextLine();
            nameInput.close();
            return name;
        }catch (Exception e){
        }
        return null;
    }

    public static void main(String[] args) {
        String[] people = {"Rudi","Agus","Putri","Ika","Rizky","Summacher"};
        String nameSearch = inputName();
        FindName(nameSearch, people);
    }
}