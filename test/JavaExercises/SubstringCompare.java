package JavaExercises;

public class SubstringCompare {
    public static String largestAndSmallestSubstring(String word, int num){
        String largest = "";
        String smallest = word.substring(0,num);
        for (int i = 0; i < word.length() - num + 1; i++) {
            if (word.substring(i,num+1).compareTo(smallest)< 0 ){
                smallest = word.substring(i,num+1);
            }
        }
        return smallest+"\n"+largest;
    }

    public static void main(String[] args) {
        System.out.println(largestAndSmallestSubstring("welcometojava",3));
    }
}
