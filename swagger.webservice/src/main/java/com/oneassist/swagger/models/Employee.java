package com.oneassist.swagger.models;

/**
 * Employee model
 * 
 * @author Sanjeev Gupta
 *
 */
public class Employee {

	private String name;
	private String dateOfBirth;
	private int age;
	private int employeeId;
	private String jobProfile;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the jobProfile
	 */
	public String getJobProfile() {
		return jobProfile;
	}

	/**
	 * @param jobProfile
	 *            the jobProfile to set
	 */
	public void setJobProfile(String jobProfile) {
		this.jobProfile = jobProfile;
	}

}
