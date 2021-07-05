package Chapter15;

public class Students {
    private String firstName;
    private String lastName;
    private int level;
    private int year;

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Students(String firstName, String lastName, int level, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.level = level;
        this.year = year;
    }
}
