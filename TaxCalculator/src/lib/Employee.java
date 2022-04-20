package lib;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Employee extends Salary{
	private String employeeId;
	

	Person person;
	EntryJob entryJob;
	Passport passport;
	Salary salary;
	Status status;
	
	public Employee(String employeeId, String fullName, String idNumber, String address, String entryDate, boolean isForeigner, boolean gender) {
		this.employeeId = employeeId;
		this.person.setFullName(fullName);
		this.person.setAddress(address);
		this.person.setIdNumber(idNumber);
		this.entryJob.setEntryDate(LocalDate.parse(entryDate, DateTimeFormatter.ofPattern("yyyy-mm-dd")));;
		this.passport.setIsForeigner(isForeigner);
		this.passport.setGender(gender);
		this.status.setChildNames(new LinkedList<String>());
		this.status.setChildIdNumbers(new LinkedList<String>());
	}
	
	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			salary.setMonthlySalary(3000000);
			if (passport.isIsForeigner()) {
				this.salary.setMonthlySalary((int) (3000000 * 1.5));
			}
		}else if (grade == 2) {
			this.salary.setMonthlySalary(5000000);
			if (passport.isIsForeigner()) {
				this.salary.setMonthlySalary((int) (5000000 * 1.5));
			}
		}else if (grade == 3) {
			salary.setMonthlySalary(7000000);
			if (passport.isIsForeigner()) {
				this.salary.setMonthlySalary((int) (7000000 * 1.5));
			}
		}
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.status.setSpouseName(spouseName);
		Person spouse = new Person();
		spouse.setIdNumber(spouseIdNumber);
		this.status.setSpouseIdNumber(spouse.getIdNumber());
	}
	
	public void addChild(String childName, String childIdNumber) {
		this.status.getChildNames().add(childName);
		this.status.getChildIdNumbers().add(childIdNumber);
	}
	
	public int getAnnualIncomeTax() {
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == entryJob.getEntryDate().getYear()) {
			this.entryJob.setMonthWorkingInYear(date.getMonthValue() - this.entryJob.getEntryDate().getMonthValue());
		}else {
			this.entryJob.setMonthWorkingInYear(12);
		}
	
		return TaxFunction.calculateTax(salary.getMonthlySalary(), salary,getAdditionalIncome(), entryJob.getMonthWorkingInYear(), salary.getAnnualDeductible(), status.getSpouseIdNumber().equals(""), status.getChildIdNumbers().size());
	}
}
