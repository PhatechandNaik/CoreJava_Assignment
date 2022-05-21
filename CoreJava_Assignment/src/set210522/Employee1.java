package set210522;

public class Employee1 implements Comparable<Employee1>{
	int empId;
	String name;
	float sal;
	Employee1(int empId, String name, float sal){
		this.empId = empId;
		this.name = name;
		this.sal = sal;
	}
	public int compareTo(Employee1 e) {
		return this.empId-e.empId;
	}
	public String toString() {
		return "[ empId : "+ empId + ", name : "+ name +", sal : "+ sal+" ]";
	}
}
