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
        System.out.println(winner.name + " has a bmi of " + winner.calculateBmi());
    }



}
