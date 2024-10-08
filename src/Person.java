public class Person {

    public static final int RETIREMENT_AGE = 67;
    public static final int MAX_NUMBER_OF_SPOUSES = 1;

    public String firstName;
    public String lastName;
    public int height;
    public int weight;
    public boolean isMarried;
    private int age;

    public String fullName() {
        return firstName + " " + lastName;
    }

    public double calculateBmi() {
        double heightInMeters = height / 100.0;
        double bmi = weight / heightInMeters / heightInMeters;
        return bmi;
    }

    public void oneYearOlder() {
        age++;
    }

    public void changeAgeTo(int newAge){
        if (newAge >= 1 && newAge <= 120) {
            age = newAge;
        }
    }

    public int getMyAge() {
        return age < 60 ? age : 60;
    }



}
