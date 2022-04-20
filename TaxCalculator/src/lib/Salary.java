package lib;

public class Salary extends Passport{

	//Salary
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	

    /**
     * @return int return the monthlySalary
     */
    public int getMonthlySalary() {
        return monthlySalary;
    }

    /**
     * @param monthlySalary the monthlySalary to set
     */
    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    /**
     * @return int return the otherMonthlyIncome
     */
    public int getAdditionalIncome() {
        return otherMonthlyIncome;
    }

    /**
     * @return int return the annualDeductible
     */
    public int getAnnualDeductible() {
        return annualDeductible;
    }

}
