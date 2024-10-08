public class MainApplication {

    public static void showData(Person person) {
        System.out.println("Name=" + person.name);
        System.out.println("Height=" + person.height);
    }


    public static void main(String[] args) {
        Person winner = new Person();
        winner.name = "Helen";
        winner.height = 167;
        winner.isMarried = true;
        showData(winner);
    }

}
