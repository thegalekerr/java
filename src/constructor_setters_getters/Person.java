
package constructor_setters_getters;

public class Person {
    
    //encapsulation
    private String name;
    private int age;
    
    //static variable increments when contructor is called
    private static int number_of_constructor_called;
    
    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        
        number_of_constructor_called++;
    }
    
    
    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    
    public int getConctructorCounter() {
        return number_of_constructor_called;
    }
    
    //override toString()
    public String toString() {
        return name + " " + age + " " + number_of_constructor_called;
    }
}
