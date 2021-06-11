package Chapter14Strings;

public class ClassWork {
    public static void main(String[] args) throws InterruptedException {
        String a = "7010010682 234";
        StringBuilder stringBuilder = new StringBuilder(a.substring(11));
        stringBuilder.insert(3,")");
        stringBuilder.insert(0,"(+");

        int count = 0;
        for (int i = a.length()-5; i >= 0 ; i--) {
            if (count %3 == 0 ){
                stringBuilder.append("-");
            }
            stringBuilder.append(a.charAt(i));
            count++;

        }
        System.out.println(stringBuilder);
    }
}
