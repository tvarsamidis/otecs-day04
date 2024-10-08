public class Person {

    public static final int RETIREMENT_AGE = 67;
    public static final int MAX_NUMBER_OF_SPOUSES = 1;

    public String name;
    public int height;
    public int weight;
    public boolean isMarried;
    public int age;

    public static double staticCalculateBmi(Person person) {
        double heightInMeters = person.height / 100.0;
        double bmi = person.weight / heightInMeters / heightInMeters;
        return bmi;
    }
    public  double calculateBmi() {
        double heightInMeters = height / 100.0;
        double bmi = weight / heightInMeters / heightInMeters;
        return bmi;
    }
}
