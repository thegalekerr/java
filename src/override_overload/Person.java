
package override_overload;

public class Person {
    
    public String doOverride() {
        return "person override";
    }
    public String doOverload(int a) {
        return "person overload (int)";
    }
    public String doOverload(int a, int b) {
        return "person overload (int, int)";
    }
}
