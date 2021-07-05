package Chapter8_classesAndObject;

public class Date {
    public final String[] MONTHS = {
        "January" , "February","March","April", "May","June","July","August","September"
            ,"October","November","December"
    };

    private final int[] DAYS_IN_MONTHS = {
            31, 28, 31,30,31,
            30,31,31,30,31,30,31
    };
    private int month;
    private int day;
    private int year;
    private int daysInYear = calculateDaysInAYear(month, day);

    public Date (int month, int day, int year){
        if(month<1 || month >12){
            throw new IllegalArgumentException("Month out of range");
        }
        if(day< 1|| day > 31){
            throw new IllegalArgumentException("Day out of range");
        }
        this.month = month;
        this.day = day;
        this.year = year;
    }
    public Date (String month, int day, int year){
        this.day = day;
        this.year = year;

        int result = getMonthIndex(month);
        if (result < 0){
            throw new IllegalArgumentException("Month is not Valid");
        }
        this.month = result;
        this.daysInYear = calculateDaysInAYear(this.month,this.day);

    }
    public Date(int day, int year) {
        this.year = year;
        if (day <= 31 && day > 0) {
            this.day = day;
            this.month = 1;
        } else {
            calculateMonthAndDay(day);
        }
        this.daysInYear = day;
    }
    private int getMonthIndex(String month){
        for (int i = 0; i < MONTHS.length; i++)
            if (month.equals(MONTHS[i]))
                return  i+1;
        return -1;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int calculateDaysInAYear(int month, int day){
        int sum = day;
        for (int i = 0; i <month-1; i++) {
            sum+=DAYS_IN_MONTHS[i];


        }
    return sum;
    }

    public void calculateMonthAndDay(int daysInAYear) {
        int result;
        for (int i = 0; i < DAYS_IN_MONTHS.length; i++) {
            daysInAYear -= DAYS_IN_MONTHS[i];

            if(daysInAYear<= 31 && daysInAYear >0){
                setDay(daysInAYear);
                setMonth(i +2);
            }


        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%d%n%s %02d, %d%n%d %d" ,
                              month, day, year,
                this.MONTHS[month-1], day, year,
                daysInYear );
    }





    public static void main(String[] args) {
        Date date1 = new Date(10,14,2002);
        Date date2 = new Date("March", 3, 2005);
        Date date3 = new Date(182,2000);

        System.out.printf("Date Objects with 3 in args --> %s",date1);
        System.out.printf("Date Objects with String(Month), int(Day), int (year)", date2);
        System.out.printf("Date Objects with int ( day), int ( year)",date3);
    }

}
