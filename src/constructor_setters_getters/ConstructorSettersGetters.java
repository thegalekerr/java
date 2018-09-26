
package constructor_setters_getters;

public class ConstructorSettersGetters {
    public static void main(String[] args) {
        Person first_person = new Person("first name", 1);
        System.out.println("Person first_person = new Person(\"first name\", 1); =  " + first_person.toString());
        
        Person second_person = new Person("second name", 2);
        System.out.println("Person second_person = new Person(\"second name\", 2); =  " + second_person.toString());
        
        first_person = new Person("first_person constructor", 3);
        System.out.println("first_person = new Person(\"first_person constructor\", 3); =  " + first_person.toString());
        
        first_person.setAge(0);
        System.out.println("first_person.setAge(0); =  " + first_person.toString());
        System.out.println("second_person.toString(); =  " + second_person.toString());
    }
}
