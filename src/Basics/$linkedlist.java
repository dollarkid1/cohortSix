package Basics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class $linkedlist {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

       addInOder(placesToVisit,"Sydney");
       addInOder(placesToVisit,"Melbourne");
       addInOder(placesToVisit,"Brisbane");
       addInOder(placesToVisit,"Perth");
       addInOder(placesToVisit,"Canberra");
       addInOder(placesToVisit,"Adelaide");
       addInOder(placesToVisit,"Darwin");
       printList(placesToVisit);
        addInOder(placesToVisit,"Alice Springs");
        addInOder(placesToVisit,"Darwin");
        printList(placesToVisit);
    }
    private static void printList(LinkedList<String> list){
        Iterator<String> i = list.listIterator();
        while (i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("======================================");
    }

    private static boolean addInOder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if (comparison > 0){stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }else if (comparison < 0){

            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();
    }















}
