public class MainApplication {

    public static void showData(Person person) {
        System.out.println("Name=" + person.firstName);
        System.out.println("Height=" + person.height);
        System.out.println("Age=" + person.getMyAge());
    }

    public static void main(String[] args) {
        Person winner = new Person();
        winner.firstName = "Helen";
        winner.lastName = "Anastasopoulos";
        winner.height = 167;
        winner.weight = 65;
        winner.isMarried = true;
        winner.changeAgeTo(43);
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();
        winner.oneYearOlder();

        showData(winner);
        System.out.println(winner.fullName() + " has a bmi of " + winner.calculateBmi());
    }



}
