package JavaExercises;
//Difference between Static and Non-Static
public class StaticVsNonStatic {
    static void myStatic(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myNonStatic(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStatic();

        StaticVsNonStatic newObject = new StaticVsNonStatic();
        newObject.myNonStatic();
    }
}
