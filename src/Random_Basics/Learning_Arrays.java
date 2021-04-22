package Random_Basics;

public class Learning_Arrays {
    public static void main(String[] args) {

        int[][] x= new int[9][];
        x[0]= new int[17];
        x[1]= new int[9];

/*
        int [] z = new int[6];
        z[0]= 13;
        z[1]= 21;
        z[2]= 5;
        z[3]= 94;
        z[4]= 44;

        int [] d = {10,20,30,6};
        char[] a = {'a','b','c','d','e'};
        String[] s ={"a","bad","or","more"};
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
        for ( int i: d) {
            System.out.println(i);
        }
        for (String i: s) {
            System.out.println(i);
        }*/


        int[][] v = {{10,20},{30,40,50}};

        for (int[] i:v) {
            System.out.println(i);

        }


        int [][] dd=new int[6][3];
        System.out.println(dd.length);
        System.out.println(dd[0].length+ dd[2].length);

     /*
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.println(v[i][j]);
            }

        }*/




    }
}
