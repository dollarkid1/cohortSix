package Chapter7;
// copy an array

public class ArrayCopy {

    public static void main(String[] args) {

        int [] sourceArray = {2,33,17,9,23,4,91};
        int [] targetArray = new int[sourceArray.length];

      /*  // 1. for-loop
        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }*/


        // 2. Array copy method

        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);
        for (int i : targetArray) {
            System.out.println(i);
        }

    }
}
