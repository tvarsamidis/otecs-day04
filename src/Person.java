public class Person {

    public static final int RETIREMENT_AGE = 67;
    public static final int MAX_NUMBER_OF_SPOUSES = 1;

    private String firstName;
    private String lastName;
    private int height;
    private int weight;
    private boolean isMarried;
    private int age;

    public Person() {
        System.out.println("Hello, I am creating a new Person!");
    }

    public Person(String firstName, String lastName){
        System.out.println("Hello, I am creating a new Person with a full name!");
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String fullName() {
        return firstName + " " + lastName;
    }

    public double calculateBmi() {
        double heightInMeters = height / 100.0;
        double bmi = weight / heightInMeters / heightInMeters;
        return bmi;
    }


    public Person createSibling(){
        Person sibling = new Person();
        sibling.setLastName(lastName);
        sibling.age = this.age + 10;
        sibling.setHeight(getHeight());
        sibling.setWeight(getWeight());
        sibling.setFirstName(getFirstName());
        return sibling;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}











