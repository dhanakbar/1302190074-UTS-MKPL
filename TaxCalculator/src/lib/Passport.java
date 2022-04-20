package lib;
public class Passport extends Status{
	//Passport
	private boolean isForeigner;
	private enum Gender{LAKI_LAKI, PEREMPUAN}; //true = Laki-laki, false = Perempuan
	private String gender;


    /**
     * @return boolean return the isForeigner
     */
    public boolean isIsForeigner() {
        return isForeigner;
    }

    /**
     * @param isForeigner the isForeigner to set
     */
    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    /**
     * @return String return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
		this.gender = gender? Gender.LAKI_LAKI.toString() : Gender.PEREMPUAN.toString();
    }

}