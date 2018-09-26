
package override_overload;

public class OverrideOverload {
    public static void main(String[] args) {
        Person person = new Person();
        Student student = new Student();
        Teacher teacher = new Teacher();
        
        System.out.println("1 => " + person.doOverride());
        System.out.println("2 => " + person.doOverload(0));
        System.out.println("3 => " + person.doOverload(0, 0));
        
        System.out.println("1 => " + student.doOverride());
        System.out.println("2 => " + student.doOverload(0));
        System.out.println("3 => " + student.doOverload(0, 0));
        
        
        System.out.println("1 => " + teacher.doOverride());
        System.out.println("2 => " + teacher.doOverload(0));
        System.out.println("3 => " + teacher.doOverload(0, 0));
        
    }
}
