package dounguyenhathan.com.model;

import java.util.Date;

public abstract class Person implements Mammal {

	private String firstName;
	private BloodGroup blood;
	private Adress homeAddress;
	private Adress schoolAddress;
	
	
	public Adress getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(Adress schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setDateOfBirth(Date dob) {
		
	}

	@Override
	public int getAgeAsDays() {
		
		return 0;
	}

}
