package Basics;
import java.util.ArrayList;
public class ArrayListCollection {
    public static void main(String[] args) {
        ArrayList<String>container = new ArrayList<String>();
        container.add("50");
        container.add("red");
        container.add("white");
        display(container);
        container.remove(0);
        System.out.println("new list");
        display(container);
    }


    public static void display(ArrayList<String> container){
        for(String items  : container)
            System.out.println(items);
    }
}
