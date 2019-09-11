package dto;

public class KindBean {
	private String kind1;
	private String kind2;
	private String brower;
	private String testKind;
	private String testCaseId;

	public KindBean() {
	}

	public String getTestCaseId() {
		return testCaseId;
	}

	public void setTestCaseId(String testCaseId) {
		this.testCaseId = testCaseId;
	}

	public String getKind1() {
		return kind1;
	}

	public void setKind1(String kind1) {
		this.kind1 = kind1;
	}

	public String getKind2() {
		return kind2;
	}

	public void setKind2(String kind2) {
		this.kind2 = kind2;
	}

	public String getBrower() {
		return brower;
	}

	public void setBrower(String brower) {
		this.brower = brower;
	}

	public String getTestKind() {
		return testKind;
	}

	public void setTestKind(String testKind) {
		this.testKind = testKind;
	}
}
