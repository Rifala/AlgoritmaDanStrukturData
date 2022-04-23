public class test2 {

//    public void printGraph(int[] jarak, int x){
//        System.out.println("Jarak : ");
//        System.out.println(x + "-----" + jarak[x]);
//
//    }
    public int minJarak(int jarak[], Boolean[] b){

        int min = -1;
        for (int x = 0; x < 8; x++){
            if (!b[x] && (min == -1 || jarak[x] < jarak[min])){
//                min = jarak[x];
                min = x;
            }

        }return min;

    }




    public void dijsktra(int graph[][]){
        int[] jarak = new int[8];

        Boolean[] b = new Boolean[8];

        for (int i = 0; i < 8; i++){
            jarak[i] = Integer.MAX_VALUE;
            b[i] = false;
        }

        jarak[0] = 0;

        int u = minJarak(jarak,b);
        b[u] = true;
        for (int x = 0; x < 8; x++){
            if (!b[x] && graph[u][x] != 0 && jarak[u] != Integer.MAX_VALUE && jarak[u] + graph[u][x] < jarak[x]){
                jarak[x] = jarak[u] + graph[u][x];

            }

//            printGraph(jarak,x);
        }

        for (int a = 0; a < 8; a++){
            System.out.println("Jarak : ");
            System.out.println(a + " " + jarak[a]);
        }


    }

    public static void main(String[] args) {
//        int[][] angka = {{0,1,0,0,0,0,1,1},
//                {1,0,0,1,0,0,0,0},
//                {0,0,0,0,1,0,0,1},
//                {0,1,0,0,1,0,0,0},
//                {0,0,1,1,0,1,0,0},
//                {0,0,0,0,1,0,0,0},
//                {1,0,0,0,0,0,0,0},
//                {1,0,1,0,0,0,0,0}};
//
//        for (int baris = 0; baris < 8; baris++){
//            for (int kolom = 0; kolom < 8; kolom++){
//                System.out.print(angka[baris][kolom] + " ");
//            }
//
//            System.out.println(" ");
//        }


        //a,b,c,d,e,f,g,h
        int[][] graph = new int[][] {{0,4,0,0,0,0,2,6},
                                    {4,0,0,1,0,0,0,0},
                                    {0,0,0,0,3,0,0,5},
                                    {0,1,0,0,2,0,0,0},
                                    {0,0,3,2,0,2,0,0},
                                    {0,0,0,0,2,0,0,0},
                                    {2,0,0,0,0,0,0,0},
                                    {6,0,5,0,0,0,0,0}};

        test2 p = new test2();
        p.dijsktra(graph);
    }

}
//{4,2,6},
//        {4,1},
//        {3,5},
//        {1,2},
//        {3,2,2},
//        {2},
//        {2},
//        {6,5}