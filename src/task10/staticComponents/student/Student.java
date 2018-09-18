package task10.staticComponents.student;

public class Student {

	private String name;
	private String surname;
	private int idNumber;
	public static int numberOfStudents = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public Student() {

	}

	public Student(String name, String surname, int idNumber) {

		setName(name);
		setSurname(surname);
		setIdNumber(idNumber);

	}

}
