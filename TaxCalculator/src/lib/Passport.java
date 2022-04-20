package lib;
public class Passport extends Status{
	private boolean isForeigner;
	private enum Gender{LAKI_LAKI, PEREMPUAN};
	private String gender;

    public boolean isIsForeigner() {
        return isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
		this.gender = gender? Gender.LAKI_LAKI.toString() : Gender.PEREMPUAN.toString();
    }

}