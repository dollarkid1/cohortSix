package Chapter8_classesAndObject;

class Time1Test {
    public static void main(String[] args) {

        Time1 time = new Time1();

        time.setHour(11);
        time.setMinute(11);
        time.setSecond(44);

        System.out.println(time);
        System.out.println();

        try {
            time.setSecond(99);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            time.setMinute(432);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try{
            time.setHour(40);
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }



}