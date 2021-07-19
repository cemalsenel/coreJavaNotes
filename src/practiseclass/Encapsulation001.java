package practiseclass;

public class Encapsulation001 {

	private String collegeName = "Colombia";
	private int age = 23;
	private boolean old = true;
	private String ssn = "123456789";
	private String name ="Kubra";
	public String getName() {
		return name;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public int getAge() {
		return age;
	}
	public boolean isOld() {
		return old;
	}
	public String getSsn() {
		return "*****" + ssn.substring(5);
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setOld(boolean old) {
		this.old = old;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	

}
