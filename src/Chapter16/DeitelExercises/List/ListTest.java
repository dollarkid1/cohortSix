package Chapter16.DeitelExercises.List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListTest {
    public static void main(String[] args) {
        String[] colors =
                {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list = new LinkedList<>();

        for (String i : colors)
            list.add(i);

        String[] colors2 =
                {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String> list1 = new LinkedList<>();

        for (String j : colors)
            list1.add(j);

            list.addAll(list1);
            list1 = null;

            printList(list);

        convertToUpperCase(list);
            printList(list);

        System.out.printf("%n Deleting elements from 4-6");
        removedItems(list,4,7);
        printList(list);

        printReversedList(list);





    }
   static void printList(List<String> list){
        System.out.printf("%n list :%n");
        for (String i : list)
            System.out.printf("%s ", i);
        System.out.println();
    }

    static void convertToUpperCase(List<String> list){
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }

    static void removedItems(List<String> list, int start, int end){
        list.subList(start,end).clear();
    }

    static void printReversedList(List<String> list){
        ListIterator<String>iterator = list.listIterator(list.size());
        System.out.printf("%n Reversed List :%n");
        while (iterator.hasPrevious()){
            System.out.printf("%s ", iterator.previous());
        }
    }



}
