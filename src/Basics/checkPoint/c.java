package Basics.checkPoint;

public class c {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 1,3,6);
        System.out.println(java.util.Arrays.toString(list1));

        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));
        System.out.print(java.util.Arrays.equals(list1, list2));
    }
}
