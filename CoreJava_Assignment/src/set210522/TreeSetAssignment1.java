package set210522;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetAssignment1 {

	public static void main(String[] args) {
		// 18. add user defined objects of type Employee and print contents
		// gives ClassCastException
		TreeSet<Employee> emps1 = new TreeSet<Employee>();
		emps1.add(new Employee(1202, "Ankita", 30000f));
		emps1.add(new Employee(1207, "Ankit", 32000f));
		emps1.add(new Employee(1205, "Sambit", 35000f));
		emps1.add(new Employee(1210, "Sangita", 40000f));
		for(Employee e : emps1) {
			System.out.println(e);
		}
		
		System.out.println("-------------------------------------");
		// 19. try to add duplicate Employee objects and print contents
		// gives ClassCastException
		System.out.println("employees details having duplicate employees");
		TreeSet<Employee> emps2 = new TreeSet<Employee>();
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
		// 20. in above implements comparable interface and see the result
		System.out.println("employees details having duplicate employees");
		System.out.println("where Emploee1 is implements Comparable interface");
		TreeSet<Employee1> emps3 = new TreeSet<Employee1>();
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
		// 21. create tree set and store the above elements in reverse order
		System.out.println("employees details in reverse order");
		TreeSet<Employee1> emps4 = new TreeSet<Employee1>(Collections.reverseOrder());
		emps4.add(new Employee1(1202, "Ankita", 30000f));
		emps4.add(new Employee1(1207, "Ankit", 32000f));
		emps4.add(new Employee1(1205, "Sambit", 35000f));
		emps4.add(new Employee1(1210, "Sangita", 40000f));
		emps4.add(new Employee1(1202, "Ankita", 30000f));
		emps4.add(new Employee1(1207, "Ankit", 32000f));
		for(Employee1 e : emps4) {
			System.out.println(e);
		}
		
	}
}
