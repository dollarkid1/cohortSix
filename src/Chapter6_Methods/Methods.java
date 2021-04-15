package Chapter6_Methods;
public class Methods {
    public static int num(int i1, int i2) {
       int result =0,sum=0;
       for (i1=0; i1<=i2; i1++);
       sum+=i1;
       result=sum;
       return result;
    }

    public static int multiply(int a,int b){
        return a*b;
    }

    public static int division(int a,int b){
        return a/b;
    }

    public static int subtraction(int a,int b){
        return a-b;
    }

    public static void main(String[] args) {

        System.out.println("total sum is "+num(29, 99));
        System.out.println(subtraction(213,3));
        System.out.println(division(92,20));
        System.out.println(multiply(42,345));

    }


}
