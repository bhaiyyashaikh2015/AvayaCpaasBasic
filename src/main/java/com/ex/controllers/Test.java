package com.ex.controllers;

import com.ex.pojo.DbAccount;
import com.ex.pojo.Root;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {
	
	public static void main(String[] args) {
		
		
//		System.out.println("Inside show()...");
//		String jsonData = "{\"persistToEDM\":\"true\",\"groupId\":\"8133232356\",\"data\":{\"ANI\":\"8133232356\",\"CaseNumber\":\"926342884\",\"PatientAccount\":\"20200917044\",\"FacilityID\":\"445032\",\"HospitalName\":\"HCA TEST HOSPITAL\",\"HIPAA\":\"Y\",\"Language\":\"english\",\"GuarantorFirstName\":\"BA752 RETESTPTT\",\"GuarantorLastName\":\"7A CCTEST\",\"GuarantorName\":\"BA752 RETESTPTT 7A CCTEST\",\"GuarantorStreet\":\"100 CREDIT PKWY\",\"GuarantorCity\":\"MT JULIET\",\"GuarantorState\":\"TN\",\"GuarantorZipCode\":\"37122\",\"PatientFirstName\":\"BA752 RETESTPTT\",\"PatientLastName\":\"7A\",\"PatientName\":\"BA752 RETESTPTT 7A\",\"DateOfService\":\"06/12/2018\",\"GuarantorDateOfBirth\":\"05/11/1966\",\"CompanyNumber\":\"01\",\"AccountBalance\":\"50.0\",\"DirectionOfCall\":\"Inbound\",\"CallStartTime\":\"12/17/2020 13:20:14\",\"CallDuration\":\"120\",\"DNIS\":\"1702009001\",\"CollectorOwner\":\"99\",\"PaymentType\":\"1\",\"TransferVDN\":\"1132223971\",\"TransferReason\":\"\",\"IsOpen\":\"TRUE\",\"IsHoliday\":\"FALSE\"}}";
//		System.out.println("jsonData ==> " +jsonData);
//		Gson gson = new Gson();
//		Root root = gson.fromJson(jsonData, Root.class);
//		System.out.println("persistToEDM ==> " + root.getPersistToEDM());
//		System.out.println("groupId ==> " + root.getGroupId());
//		System.out.println("data ==> " + root.getData());
		
		
		
//		System.out.println("============================================");
//		
//		ObjectMapper om = new ObjectMapper();
//		try {
//			Root root2 = om.readValue(jsonData, Root.class);
//			System.out.println("persistToEDM ==> " + root2.getPersistToEDM());
//			System.out.println("groupId ==> " + root2.getGroupId());
//			System.out.println("data ==> " + root2.getData());
//		} catch (JsonMappingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
		System.out.println("============================================");
		ObjectMapper om = new ObjectMapper();
		String jsonData2 = "{\"accountFound\":true,\"numberOfAccounts\":1,\"matches\":[{\"caseNumber\":\"23281083\",\"companyNumber\":\"01\"}],\"additionalInfo\":[{\"firstName\":\"\",\"lastName\":\"\",\"guardianDOB\":\"\",\"guardianSSN\":\"\",\"fill\":\"\"}]}";
		try {
			DbAccount dbAccount = om.readValue(jsonData2, DbAccount.class);
			System.out.println("getNumberOfAccounts ==> " + dbAccount.getNumberOfAccounts());
			System.out.println("getMatches ==> " + dbAccount.getMatches());
			System.out.println("getAdditionalInfo ==> " + dbAccount.getAdditionalInfo());
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
