package Chapter7;

import Chapter6_Methods.RandomCharacter;

import static java.lang.System.*;

public class RandomizedCharacters {

    public static void main(String[] args) {
        char[] chars = charactersArray();
        out.println("The lowercase letters are:");
        displayArray(chars);
        out.println("The occurrences of each letter are:");
        int[] counts = countLetters(chars);
        displayCount(counts);

    }

    public static char[] charactersArray(){
        char[] charArray = new char[100];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i]= RandomCharacter.getRandomLowerCaseLetter();
        }
       return charArray;
    }

    public static void displayArray(char[] array){
        for (int i = 0; i < array.length; i++) {
            if ((i + 1 ) % 20 == 0)
            out.println(array[i]);
            else out.print(array[i] + " ");
        }

    }

    public static int[] countLetters(char[] array){
        var count = new int[26];
        for (char c : array) {
            int index = c - 'a';
            count[index]++;

        }
        return count;
    }

    public static void displayCount(int[] count){
        for (int i = 0; i < count.length ; i++) {
            if ((i + 1) % 10 == 0) {
                out.println(count[i] + " " + (char)(i + 'a'));
            } else out.print(count[i] + " " + (char)(i + 'a')+"  ");

        }
    }

}
