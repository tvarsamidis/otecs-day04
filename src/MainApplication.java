import java.io.File;

public class MainApplication {

    public static void main(String[] args) {
        Person winner = new Person("Maria", "Maria");
        winner.setHeight(167);
        winner.setWeight(65);
        winner.setMarried(true);
        winner.setAge(43);
        Person p2 = winner.createSibling();

        System.out.println("The original sibling is " + winner.fullName());
        System.out.println("The other sibling is " + p2.fullName());

        if (winner == p2) {
            System.out.println("the two siblings are the same");
        } else {
            System.out.println("the two siblings are different");
        }

        Person randomPerson =Math.random() > 0.5 ? winner : p2;

    }



}
