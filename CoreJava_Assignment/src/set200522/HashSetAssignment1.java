package set200522;

import java.util.ArrayList;
import java.util.HashSet;

class Employee{
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
class Employee1 implements Comparable<Employee1>{
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
public class HashSetAssignment1 {

	public static void main(String[] args) {
		// 10. add user defined objects of type Employee and print contents
		HashSet<Employee> emps1 = new HashSet<Employee>();
		emps1.add(new Employee(1202, "Ankita", 30000f));
		emps1.add(new Employee(1207, "Ankit", 32000f));
		emps1.add(new Employee(1205, "Sambit", 35000f));
		emps1.add(new Employee(1210, "Sangita", 40000f));
		for(Employee e : emps1) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------");
		// 11. try to add duplicate Employee objects and print contents
		System.out.println("employees details having duplicate employees");
		HashSet<Employee> emps2 = new HashSet<Employee>();
		emps2.add(new Employee(1202, "Ankita", 30000f));
		emps2.add(new Employee(1207, "Ankit", 32000f));
		emps2.add(new Employee(1205, "Sambit", 35000f));
		emps2.add(new Employee(1210, "Sangita", 40000f));
		emps2.add(new Employee(1202, "Ankita", 30000f));
		emps2.add(new Employee(1207, "Ankit", 32000f));
		for(Employee e : emps2) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------");
		// 12. in above implements comparable interface and see the result
		System.out.println("employees details having duplicate employees");
		System.out.println("where Emploee1 is implements Comparable interface");
		HashSet<Employee1> emps3 = new HashSet<Employee1>();
		emps3.add(new Employee1(1202, "Ankita", 30000f));
		emps3.add(new Employee1(1207, "Ankit", 32000f));
		emps3.add(new Employee1(1205, "Sambit", 35000f));
		emps3.add(new Employee1(1210, "Sangita", 40000f));
		emps3.add(new Employee1(1202, "Ankita", 30000f));
		emps3.add(new Employee1(1207, "Ankit", 32000f));
		for(Employee1 e : emps3) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------");
		// 13. convert a hash set to list/array list
		System.out.println("convert hashset emps1 to ararylist");
		System.out.println("emps1 elements");
		for(Employee e : emps1) {
			System.out.println(e);
		}
		System.out.println();
		ArrayList<Employee> list = new ArrayList<>(emps1);
		System.out.println("array list elemets");
		for(Employee e : list) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------");
		// 14. compare two hash sets
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(12);
		set1.add(23);
		set1.add(34);
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(12);
		set2.add(23);
		set2.add(34);
		set2.add(45);
		System.out.println("set1 : "+set1);
		System.out.println("set2 : "+set2);
		System.out.print("does set1 and set2 equals : ");
		System.out.println(set1.containsAll(set2)&& set2.containsAll(set1));
		
		System.out.println("-------------------------------------");
		// compare two set and retain same elements
		System.out.println("compare set1 and set2 and retain same elements");
		set1.retainAll(set2);
		System.out.println(set1);

	}

}
