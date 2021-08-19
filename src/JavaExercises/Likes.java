package JavaExercises;

public class Likes {

    public static void like(String[] array){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        System.out.println(array.length);
        if (array.length <= 3){
                for (String i : array)
                sb.append(i).append(" ");
            System.out.println(sb +"likes your photo");
        }
        else
            for (int i = 0; i < array[1].length(); i++)count++;
                if (count - 2 == 1) {
                System.out.println(array[0] + " and " + array[1] + " with " + (count - 2) + " other likes your photo");
                }
                else System.out.println(array[0] + " and " + array[1] + " with " + (count - 2) + " others likes your photo");
    }


    public static void main(String[] args) {

        String[] names1 = {"fred","dan","lee","stan","siki"};
        String[] names2 = {"fred","dan","lee"};
        String[] names3= {"fred","dan"};



       like(names2);
    }
}
