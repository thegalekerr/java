
package override_overload;

public class Teacher extends Person{
    public String doOverride() {
        return "Teacher override";
    }
    public String doOverload(int a) {
        return "Teacher overload (int)";
    }
    public String doOverload(int a, int b) {
        return "Teacher overload (int, int)";
    }
}
