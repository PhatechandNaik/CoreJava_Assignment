package set210522;

public class Employee {
	int empId;
	String name;
	float sal;
	Employee(int empId, String name, float sal){
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "[ empId : "+ empId + ", name : "+ name +", sal : "+ sal+" ]";
	}
}
