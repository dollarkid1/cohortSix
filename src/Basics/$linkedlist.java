package Basics;

import java.util.Iterator;
import java.util.LinkedList;

public class $linkedlist {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        placesToVisit.add("Lagos");
        placesToVisit.add("Las vegas");
        placesToVisit.add("Limpopo");
        placesToVisit.add("Los angeles");
        placesToVisit.add("Lisbon");

        printList(placesToVisit);
    }
    private static void printList(LinkedList list){
        Iterator<String> i = list.listIterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================================");
    }
}
