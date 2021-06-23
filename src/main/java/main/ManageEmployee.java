package main;

import java.util.List;

import dao.DaoEmployee;
import entities.Employee;

public class ManageEmployee {
	public static void main(String[] args) {

		DaoEmployee daoemployee = new DaoEmployee();

		/* Add few employee records in database */
//		Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
//		Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
//		Integer empID3 = ME.addEmployee("John", "Paul", 10000);

		List<Employee> lsEmployee = daoemployee.listEmployees();
	}
}
