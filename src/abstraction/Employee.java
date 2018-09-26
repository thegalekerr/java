
package abstraction;

public abstract class Employee {
	
    private String name;
    private int paymentPerHour;
	
    public Employee(String name) {
	this.name = name;
    }

    public abstract int calculateSalary();
    
    public String getName() {
	return name;
    }

}
