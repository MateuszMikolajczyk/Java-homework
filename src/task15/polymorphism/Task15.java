package task15.polymorphism;

import task15.polymorphism.doctor.Doctor;
import task15.polymorphism.hospital.Hospital;
import task15.polymorphism.nurse.Nurse;


public class Task15 {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		hospital.addPerson(new Nurse("s", "s" , 2, 2));
		hospital.addPerson(new Nurse("d", "d" , 3, 2));
		hospital.addPerson(new Doctor("s", "s", 3, 2));
		
		
		System.out.println(hospital);
	}

}
