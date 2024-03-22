package com.ex.pojo;

import java.util.ArrayList;

public class DbAccount {
	public boolean accountFound;
	public int numberOfAccounts;
	public ArrayList<Match> matches;
	public ArrayList<AdditionalInfo> additionalInfo;

	public DbAccount(boolean accountFound, int numberOfAccounts, ArrayList<Match> matches,
			ArrayList<AdditionalInfo> additionalInfo) {
		super();
		this.accountFound = accountFound;
		this.numberOfAccounts = numberOfAccounts;
		this.matches = matches;
		this.additionalInfo = additionalInfo;
	}

	public DbAccount() {
		super();
	}

	public boolean isAccountFound() {
		return accountFound;
	}

	public void setAccountFound(boolean accountFound) {
		this.accountFound = accountFound;
	}

	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	public void setNumberOfAccounts(int numberOfAccounts) {
		this.numberOfAccounts = numberOfAccounts;
	}

	public ArrayList<Match> getMatches() {
		return matches;
	}

	public void setMatches(ArrayList<Match> matches) {
		this.matches = matches;
	}

	public ArrayList<AdditionalInfo> getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(ArrayList<AdditionalInfo> additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String toString() {
		return "DbAccount [accountFound=" + accountFound + ", numberOfAccounts=" + numberOfAccounts + "]";
	}

}
