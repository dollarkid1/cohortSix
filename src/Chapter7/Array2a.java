package Chapter7;

public class Array2a {
    public static void main(String[] args) {
        int [] array = new int [10];
        System.out.println(array);

        for (int element : array){
            element += 2;
            System.out.print(element + " ");
        }

        for (int element : array){
            System.out.println();
            System.out.println(element + " ");
            System.out.printf("%18d", element );
        }

    }
}
