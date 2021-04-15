package Chapter6_Methods;

public class Basics {
    public static int max(int a,int b){
        int result;
        if(a>b)
            result = a;
        else
            result = b;
        return result;
    }

    public static void main(String[] args) {
    int z=max(83,45);
        System.out.println(z);
    }

}
