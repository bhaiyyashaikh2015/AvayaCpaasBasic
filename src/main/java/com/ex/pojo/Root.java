package com.ex.pojo;

public class Root {
	public String persistToEDM;
	public String groupId;
	public Data data;

	public Root() {
		super();
	}

	public Root(String persistToEDM, String groupId, Data data) {
		super();
		this.persistToEDM = persistToEDM;
		this.groupId = groupId;
		this.data = data;
	}

	public String getPersistToEDM() {
		return persistToEDM;
	}

	public void setPersistToEDM(String persistToEDM) {
		this.persistToEDM = persistToEDM;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Root [persistToEDM=" + persistToEDM + ", groupId=" + groupId + ", data=" + data + "]";
	}

}