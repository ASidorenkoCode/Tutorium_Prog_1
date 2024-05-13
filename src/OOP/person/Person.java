package OOP.person;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        setAge(age);
    }

    public Person(String firstName) {
        this.firstName = firstName;
        setAge(101);
    }

    public Person(String lastName, int age) {
        this.firstName = "Johannes";
        this.lastName = lastName;
        setAge(age);
    }

    public Person(int age) {
        setAge(age);
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        Person person2 = new Person(45);
        Person person3 = new Person();
        person3.setAge(30);
        person3.setFirstName("John");
        person.setAge(101);
        Person grossMutter = new Person("Ingrid");
        System.out.println("Die Grossmutter ist so alt: " + grossMutter.getAge());
        System.out.println(grossMutter.isTeen());
        System.out.println(person.getFullName());
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        boolean isTooOldOrTooYoung = checkAge();
        if (isTooOldOrTooYoung) return;
        this.age = age;
    }

    private boolean checkAge() {
        if (age < 0 || age > 100) {
            System.out.println("Das Alter liegt außerhalb des gültigen Bereichs.");
            return true;
        }
        return false;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firstName;
        } else if (firstName.isEmpty()) {
            return lastName;
        }
        return firstName + " " + lastName;
    }
}
