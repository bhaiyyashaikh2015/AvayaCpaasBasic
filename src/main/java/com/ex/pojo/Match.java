package com.ex.pojo;

public class Match {
	public String caseNumber;
	public String companyNumber;

	public Match(String caseNumber, String companyNumber) {
		super();
		this.caseNumber = caseNumber;
		this.companyNumber = companyNumber;
	}

	public Match() {
		super();
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	@Override
	public String toString() {
		return "Match [caseNumber=" + caseNumber + ", companyNumber=" + companyNumber + "]";
	}

}