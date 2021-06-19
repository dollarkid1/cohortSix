package Chapter16.DeitelExercises.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        String[] colors = {"MAGENTA", "RED", "BLUE", "GREEN", "WHITE"};
        List<String>list = new ArrayList<>();
        Collections.addAll(list, colors);


        String[] removeColors = { "BLUE", "GREEN", "WHITE"};
        List<String>removeList = new ArrayList<>();
        for (String i : removeColors)
            removeList.add(i);


        System.out.println("ArrayList: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }





    }
}
