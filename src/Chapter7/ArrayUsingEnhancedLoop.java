package Chapter7;

public class ArrayUsingEnhancedLoop {
    public static void main(String[] args) {
        int[] arrays = {12, 11, 42, 18, 39, 24, 32, 91, 90, 28, 13};
        int total = 0;
      for (int number : arrays)
          total += number;
        System.out.printf("the total is %d", total);
        main2(arrays);
       main2(new int[]{2, 2, 2});
    }

    public static void main2(int[] array){int total = 1;
        for(int value = 0; value < array.length; value++)
            total*=array[value];
            System.out.println(total);
    }

}