package Chapter02;

/* Java */

public class PersonUsage {
    public static void main(String[] args) {
        //Chapter02.Person
        Person person = new Person("Bob", true);
        System.out.println(person.getName());           //>>>Bob
        System.out.println(person.isMarried());         //>>>true
    }
}
