package lib;

import java.util.List;

public class Status extends Person {
    //Status
	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;

    /**
     * @return String return the spouseName
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * @param spouseName the spouseName to set
     */
    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    /**
     * @return String return the spouseIdNumber
     */
    public String getSpouseIdNumber() {
        return spouseIdNumber;
    }

    /**
     * @param spouseIdNumber the spouseIdNumber to set
     */
    public void setSpouseIdNumber(String spouseIdNumber) {
        this.spouseIdNumber = spouseIdNumber;
    }

    /**
     * @return List<String> return the childNames
     */
    public List<String> getChildNames() {
        return childNames;
    }

    /**
     * @param childNames the childNames to set
     */
    public void setChildNames(List<String> childNames) {
        this.childNames = childNames;
    }

    /**
     * @return List<String> return the childIdNumbers
     */
    public List<String> getChildIdNumbers() {
        return childIdNumbers;
    }

    /**
     * @param childIdNumbers the childIdNumbers to set
     */
    public void setChildIdNumbers(List<String> childIdNumbers) {
        this.childIdNumbers = childIdNumbers;
    }

}
