package ChapterFour;
import java.util.Scanner;
public class CustomerSupportSwitch {
    public static void main(String[] args) {
        String promptMessage = """
                Press 1 for Igbo
                Press 2 for Hausa
                Press 3 for English
                Press 4 for Yoruba
                """;
         System.out.println(promptMessage);
        Scanner userInputCollector = new Scanner(System.in);
        int userInput = userInputCollector.nextInt();
        switch (userInput) {
            case 1 -> System.out.println("igbo knewu");
            case 2 -> System.out.println("aboki");
            case 3 -> System.out.println("hello");
            case 4 -> System.out.println("omo");
            default -> System.out.println("mumu comot here");
        }
    }
}
