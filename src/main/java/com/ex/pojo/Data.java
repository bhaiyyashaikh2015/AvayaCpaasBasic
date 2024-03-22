package com.ex.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	 @JsonProperty("ANI") 
	    public String aNI;
	    @JsonProperty("CaseNumber") 
	    public String caseNumber;
	    @JsonProperty("PatientAccount") 
	    public String patientAccount;
	    @JsonProperty("FacilityID") 
	    public String facilityID;
	    @JsonProperty("HospitalName") 
	    public String hospitalName;
	    @JsonProperty("HIPAA") 
	    public String hIPAA;
	    @JsonProperty("Language") 
	    public String language;
	    @JsonProperty("GuarantorFirstName") 
	    public String guarantorFirstName;
	    @JsonProperty("GuarantorLastName") 
	    public String guarantorLastName;
	    @JsonProperty("GuarantorName") 
	    public String guarantorName;
	    @JsonProperty("GuarantorStreet") 
	    public String guarantorStreet;
	    @JsonProperty("GuarantorCity") 
	    public String guarantorCity;
	    @JsonProperty("GuarantorState") 
	    public String guarantorState;
	    @JsonProperty("GuarantorZipCode") 
	    public String guarantorZipCode;
	    @JsonProperty("PatientFirstName") 
	    public String patientFirstName;
	    @JsonProperty("PatientLastName") 
	    public String patientLastName;
	    @JsonProperty("PatientName") 
	    public String patientName;
	    @JsonProperty("DateOfService") 
	    public String dateOfService;
	    @JsonProperty("GuarantorDateOfBirth") 
	    public String guarantorDateOfBirth;
	    @JsonProperty("CompanyNumber") 
	    public String companyNumber;
	    @JsonProperty("AccountBalance") 
	    public String accountBalance;
	    @JsonProperty("DirectionOfCall") 
	    public String directionOfCall;
	    @JsonProperty("CallStartTime") 
	    public String callStartTime;
	    @JsonProperty("CallDuration") 
	    public String callDuration;
	    @JsonProperty("DNIS") 
	    public String dNIS;
	    @JsonProperty("CollectorOwner") 
	    public String collectorOwner;
	    @JsonProperty("PaymentType") 
	    public String paymentType;
	    @JsonProperty("TransferVDN") 
	    public String transferVDN;
	    @JsonProperty("TransferReason") 
	    public String transferReason;
	    @JsonProperty("IsOpen") 
	    public String isOpen;
	    @JsonProperty("IsHoliday") 
	    public String isHoliday;

	public Data() {
		super();
	}

	public Data(String aNI, String caseNumber, String patientAccount, String facilityID, String hospitalName,
			String hIPAA, String language, String guarantorFirstName, String guarantorLastName, String guarantorName,
			String guarantorStreet, String guarantorCity, String guarantorState, String guarantorZipCode,
			String patientFirstName, String patientLastName, String patientName, String dateOfService,
			String guarantorDateOfBirth, String companyNumber, String accountBalance, String directionOfCall,
			String callStartTime, String callDuration, String dNIS, String collectorOwner, String paymentType,
			String transferVDN, String transferReason, String isOpen, String isHoliday) {
		super();
		this.aNI = aNI;
		this.caseNumber = caseNumber;
		this.patientAccount = patientAccount;
		this.facilityID = facilityID;
		this.hospitalName = hospitalName;
		this.hIPAA = hIPAA;
		this.language = language;
		this.guarantorFirstName = guarantorFirstName;
		this.guarantorLastName = guarantorLastName;
		this.guarantorName = guarantorName;
		this.guarantorStreet = guarantorStreet;
		this.guarantorCity = guarantorCity;
		this.guarantorState = guarantorState;
		this.guarantorZipCode = guarantorZipCode;
		this.patientFirstName = patientFirstName;
		this.patientLastName = patientLastName;
		this.patientName = patientName;
		this.dateOfService = dateOfService;
		this.guarantorDateOfBirth = guarantorDateOfBirth;
		this.companyNumber = companyNumber;
		this.accountBalance = accountBalance;
		this.directionOfCall = directionOfCall;
		this.callStartTime = callStartTime;
		this.callDuration = callDuration;
		this.dNIS = dNIS;
		this.collectorOwner = collectorOwner;
		this.paymentType = paymentType;
		this.transferVDN = transferVDN;
		this.transferReason = transferReason;
		this.isOpen = isOpen;
		this.isHoliday = isHoliday;
	}

	public String getaNI() {
		return aNI;
	}

	public void setaNI(String aNI) {
		this.aNI = aNI;
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getPatientAccount() {
		return patientAccount;
	}

	public void setPatientAccount(String patientAccount) {
		this.patientAccount = patientAccount;
	}

	public String getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(String facilityID) {
		this.facilityID = facilityID;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String gethIPAA() {
		return hIPAA;
	}

	public void sethIPAA(String hIPAA) {
		this.hIPAA = hIPAA;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGuarantorFirstName() {
		return guarantorFirstName;
	}

	public void setGuarantorFirstName(String guarantorFirstName) {
		this.guarantorFirstName = guarantorFirstName;
	}

	public String getGuarantorLastName() {
		return guarantorLastName;
	}

	public void setGuarantorLastName(String guarantorLastName) {
		this.guarantorLastName = guarantorLastName;
	}

	public String getGuarantorName() {
		return guarantorName;
	}

	public void setGuarantorName(String guarantorName) {
		this.guarantorName = guarantorName;
	}

	public String getGuarantorStreet() {
		return guarantorStreet;
	}

	public void setGuarantorStreet(String guarantorStreet) {
		this.guarantorStreet = guarantorStreet;
	}

	public String getGuarantorCity() {
		return guarantorCity;
	}

	public void setGuarantorCity(String guarantorCity) {
		this.guarantorCity = guarantorCity;
	}

	public String getGuarantorState() {
		return guarantorState;
	}

	public void setGuarantorState(String guarantorState) {
		this.guarantorState = guarantorState;
	}

	public String getGuarantorZipCode() {
		return guarantorZipCode;
	}

	public void setGuarantorZipCode(String guarantorZipCode) {
		this.guarantorZipCode = guarantorZipCode;
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}

	public String getPatientLastName() {
		return patientLastName;
	}

	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getDateOfService() {
		return dateOfService;
	}

	public void setDateOfService(String dateOfService) {
		this.dateOfService = dateOfService;
	}

	public String getGuarantorDateOfBirth() {
		return guarantorDateOfBirth;
	}

	public void setGuarantorDateOfBirth(String guarantorDateOfBirth) {
		this.guarantorDateOfBirth = guarantorDateOfBirth;
	}

	public String getCompanyNumber() {
		return companyNumber;
	}

	public void setCompanyNumber(String companyNumber) {
		this.companyNumber = companyNumber;
	}

	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getDirectionOfCall() {
		return directionOfCall;
	}

	public void setDirectionOfCall(String directionOfCall) {
		this.directionOfCall = directionOfCall;
	}

	public String getCallStartTime() {
		return callStartTime;
	}

	public void setCallStartTime(String callStartTime) {
		this.callStartTime = callStartTime;
	}

	public String getCallDuration() {
		return callDuration;
	}

	public void setCallDuration(String callDuration) {
		this.callDuration = callDuration;
	}

	public String getdNIS() {
		return dNIS;
	}

	public void setdNIS(String dNIS) {
		this.dNIS = dNIS;
	}

	public String getCollectorOwner() {
		return collectorOwner;
	}

	public void setCollectorOwner(String collectorOwner) {
		this.collectorOwner = collectorOwner;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getTransferVDN() {
		return transferVDN;
	}

	public void setTransferVDN(String transferVDN) {
		this.transferVDN = transferVDN;
	}

	public String getTransferReason() {
		return transferReason;
	}

	public void setTransferReason(String transferReason) {
		this.transferReason = transferReason;
	}

	public String getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(String isOpen) {
		this.isOpen = isOpen;
	}

	public String getIsHoliday() {
		return isHoliday;
	}

	public void setIsHoliday(String isHoliday) {
		this.isHoliday = isHoliday;
	}

	@Override
	public String toString() {
		return "Data [aNI=" + aNI + ", caseNumber=" + caseNumber + ", patientAccount=" + patientAccount
				+ ", facilityID=" + facilityID + ", hospitalName=" + hospitalName + ", hIPAA=" + hIPAA + ", language="
				+ language + ", guarantorFirstName=" + guarantorFirstName + ", guarantorLastName=" + guarantorLastName
				+ ", guarantorName=" + guarantorName + ", guarantorStreet=" + guarantorStreet + ", guarantorCity="
				+ guarantorCity + ", guarantorState=" + guarantorState + ", guarantorZipCode=" + guarantorZipCode
				+ ", patientFirstName=" + patientFirstName + ", patientLastName=" + patientLastName + ", patientName="
				+ patientName + ", dateOfService=" + dateOfService + ", guarantorDateOfBirth=" + guarantorDateOfBirth
				+ ", companyNumber=" + companyNumber + ", accountBalance=" + accountBalance + ", directionOfCall="
				+ directionOfCall + ", callStartTime=" + callStartTime + ", callDuration=" + callDuration + ", dNIS="
				+ dNIS + ", collectorOwner=" + collectorOwner + ", paymentType=" + paymentType + ", transferVDN="
				+ transferVDN + ", transferReason=" + transferReason + ", isOpen=" + isOpen + ", isHoliday=" + isHoliday
				+ "]";
	}

}
