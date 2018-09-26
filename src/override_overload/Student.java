
package override_overload;

public class Student extends Person{
    public String doOverride() {
        return "Student override";
    }
    public String doOverload(int a) {
        return "Student overload (int)";
    }
    public String doOverload(int a, int b) {
        return "Student overload (int, int)";
    }
}
