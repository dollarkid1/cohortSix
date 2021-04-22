package Random_Basics;
/*I called it Anonymous_Arrays because i didn't give the Array a name. */
public class Anonymous_Arrays {
    public static void main(String[] args) {

      sum(new int[]{10,20,30,40,50});
    }
    private static void sum(int[] x){
        int total = 0;
        for (int i :x) {
            total= total + i;
        }
        System.out.println("the total sum is :"+ total);
    }

}
