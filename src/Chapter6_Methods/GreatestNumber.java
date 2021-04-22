package Chapter6_Methods;
/*collecting the numbers to check the Greatest number*/
import java.util.Scanner;

public class GreatestNumber {


    public static float GN(float x, float y, float z){
        float maximumValue=x;
        if (y > maximumValue)
            maximumValue=y;
        if (z > maximumValue)
            maximumValue=z;
        return maximumValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter three numbers to find the maximum");
        float x= in.nextFloat();
        float y= in.nextFloat();
        float z= in.nextFloat();

        System.out.println("the Maximum is "+ GN(x,y,z));
    }
}
