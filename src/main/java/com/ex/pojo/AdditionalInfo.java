package com.ex.pojo;

public class AdditionalInfo {
	public String firstName;
	public String lastName;
	public String guardianDOB;
	public String guardianSSN;
	public String fill;

	public AdditionalInfo() {
		super();
	}

	public AdditionalInfo(String firstName, String lastName, String guardianDOB, String guardianSSN, String fill) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.guardianDOB = guardianDOB;
		this.guardianSSN = guardianSSN;
		this.fill = fill;
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

	public String getGuardianDOB() {
		return guardianDOB;
	}

	public void setGuardianDOB(String guardianDOB) {
		this.guardianDOB = guardianDOB;
	}

	public String getGuardianSSN() {
		return guardianSSN;
	}

	public void setGuardianSSN(String guardianSSN) {
		this.guardianSSN = guardianSSN;
	}

	public String getFill() {
		return fill;
	}

	public void setFill(String fill) {
		this.fill = fill;
	}

	@Override
	public String toString() {
		return "AdditionalInfo [firstName=" + firstName + ", lastName=" + lastName + ", guardianDOB=" + guardianDOB
				+ ", guardianSSN=" + guardianSSN + ", fill=" + fill + "]";
	}

}