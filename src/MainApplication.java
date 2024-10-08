public class MainApplication {

    public static void showData(Person person) {
        System.out.println("Name=" + person.name);
        System.out.println("Height=" + person.height);
    }

    public static void main(String[] args) {
        Person winner = new Person();
        winner.name = "Helen";
        winner.height = 167;
        winner.weight = 65;
        winner.isMarried = true;
        showData(winner);
        double bmi = calculateBmi(winner);
        System.out.println(winner.name + " has a bmi of " + bmi);
    }

    private static double calculateBmi(Person person) {
        double heightInMeters = person.height / 100.0;
        double bmi = person.weight / heightInMeters / heightInMeters;
        return bmi;
    }

}
