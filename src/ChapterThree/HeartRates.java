package ChapterThree;



import java.time.LocalDate;
import java.util.Scanner;




public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;

    public HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
//    public int age(){
//        LocalDate date = new LocalDate.now();
//        int currentYear = date.getYear();
//        return currentYear - yearOfBirth;
//    }
//    public int maximumHeartRate(){
//        int mHR;
//        mHR = 220 - age();
//        return mHR;
//    }
//    public String targetHeartRate(){
//
//       double tHR1 = 0.5 * (maximumHeartRate());
//       double tHR2 = 0.85 * (maximumHeartRate());
//       return tHR1 + "-" + tHR2;
//    }

    public static void main(String[] args) {
        HeartRates myHeart = new HeartRates("dan", "lee",12, 9,2007);
        Scanner input = new Scanner(System.in);
        System.out.println("input firstName: ");
        String firstName = input.next();
        myHeart.setFirstName(firstName);

        System.out.println("input lastName: ");
        String lastName = input.next();
        myHeart.setLastName(lastName);

        System.out.println("input day of Birth: ");
        int day = input.nextInt();
        myHeart.setDayOfBirth(day);

        System.out.println("input month of Birth: ");
        int month = input.nextInt();
        myHeart.setMonthOfBirth(month);

        System.out.println("input year of Birth: ");
        int year = input.nextInt();
        myHeart.setYearOfBirth(year);


        System.out.println("First Name : "+myHeart.getFirstName()+ " LastName: " + myHeart.getLastName());
        System.out.println("Date of Birth: " + myHeart.getDayOfBirth() + "/" + myHeart.getMonthOfBirth() + "/" + myHeart.getYearOfBirth());
//        System.out.println(myHeart.age());
//        System.out.println(myHeart.maximumHeartRate());
//        System.out.println(myHeart.targetHeartRate());
    }



}
