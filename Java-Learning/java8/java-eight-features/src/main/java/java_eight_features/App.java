package java_eight_features;

import java.util.List;

import java_eight_features.models.Employee;
import java_eight_features.models.EmployeeDatabase;

public class App {
	public static void main(String[] args) {
		List<Employee> allEmployees = EmployeeDatabase.getAllEmployee();
		System.out.println(allEmployees);
	}
}