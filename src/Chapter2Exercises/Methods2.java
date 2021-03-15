package Chapter2Exercises;

public class Methods2 {
    public static void main(String[] args) {
    print(multiply(943,739));

    print(add(723,848));
    int result = multiply(82,932);
    print(result);
    result = add(843,56);
    print(result);


    result = add(43,246);
    print(result);
    print(sub(28,23));
}


    public static int multiply(int a, int b){
        return a * b;
    }
    public static int add(int a, int b){
        return a+ b;
    }
    public static int sub(int a, int b){
            return a - b;
}

    public static void print(int result){
        System.out.println(result);
    }



}
