package hello.entity;

import java.util.List;

public class Child {
	
	private long id;
	private String firstName;
	private String lastName;
	private String birthNumber;
	private List<String> allergies;
	private Gender gender;
	
	public Child(String firstName, String lastName, String birthNumber, List<String> allergies, Gender gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthNumber = birthNumber;
		this.allergies = allergies;
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthNumber() {
		return birthNumber;
	}

	public void setBirthNumber(String birthNumber) {
		this.birthNumber = birthNumber;
	}

	public List<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(List<String> allergies) {
		this.allergies = allergies;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
