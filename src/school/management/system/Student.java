package school.management.system;

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	//to create a new student by initializing (constructor).
	public Student(int id, String name, int grade){
		this.feesPaid=0;
		this.feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	/*getter and setter methods are required if you want to alter the values
	so name and id will remain unchanged.*/

	public void setGrade(int grade){
		this.grade=grade;   //used to update student grade
	}

	//keep adding fees to feesPaid
	public void payFees(int fees){
		feesPaid+=fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public int getFeesPaid(){
		return feesPaid;
	}
	public int getFeesTotal(){
		return feesTotal;
	}
	public int getRemainingFees(){
		return feesTotal-feesPaid;
	}

	public String toString(){
		return "Student's name is: "+name+", The fees paid is:"+feesPaid;

	}

}
