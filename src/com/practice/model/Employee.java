package com.practice.model;

public class Employee {

	String empId;
	String fName;
	String lName;
	String email;
	String mobileNum;
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", mobileNum=" + mobileNum + "]";
	}

	/**
	 * 
	 * @param empId
	 * @param fName
	 * @param lName
	 * @param email
	 * @param mobileNum
	 */
	public Employee(String empId, String fName, String lName, String email, String mobileNum) {
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.mobileNum = mobileNum;
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobileNum
	 */
	public String getMobileNum() {
		return mobileNum;
	}

	/**
	 * @param mobileNum the mobileNum to set
	 */
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

}
