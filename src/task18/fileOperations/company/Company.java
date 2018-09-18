package task18.fileOperations.company;

import java.io.Serializable;
import java.util.Arrays;

import task18.fileOperations.employee.Employee1;

public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4537580726434350848L;

	public final static int NUMBERS_OF_EMPLOYEE = 3;

	private Employee1[] employee;

	public Employee1[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee1[] employee) {
		this.employee = employee;
	}

	public Company() {
		employee = new Employee1[NUMBERS_OF_EMPLOYEE];
	}

	public void add(Employee1 employee, int index) {

		this.employee[index] = employee;

	}

	@Override
	public String toString() {
		return "Company [employee=" + Arrays.toString(employee) + "]";
	}

}
