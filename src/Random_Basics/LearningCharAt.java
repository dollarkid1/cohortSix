package Random_Basics;

public class LearningCharAt {
    public static void main(String[] args) {
        String myStr= "hello";
        char result = myStr.charAt(2);
        System.out.println(result);
        char a = myStr.charAt(0);
        char b = myStr.charAt(1);
        char c = myStr.charAt(2);
        char d = myStr.charAt(3);
        System.out.println("" + a+b+c+d);
    }
}
