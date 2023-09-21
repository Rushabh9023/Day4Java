package day4;

public class student extends Person{

	private int enroll;
	private int result;
	private int mobno;
	public int getEnroll() {
		return enroll;
	}
	public void setEnroll(int enroll) {
		this.enroll = enroll;
	}
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "student [enroll=" + enroll + ", result=" + result + ", mobno=" + mobno + "]";
	}
}
