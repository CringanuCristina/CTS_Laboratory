package ro.ase.csie.cts.entities;

public class Student {

	boolean hasScolarship;
	boolean isEnroled;
	int age;
	
	void payTuition() {} //depends on accounting
	void takeOOPExam() {} //depends on the prof
	void saveTODB() {} //depends on DB admin
	
	void incrementAge() {
		if(this.age<20) {
			this.age +=1;
		}
		else {
			this.age+=2;
		}
		
		this.age = (this.age<20)? (this.age+=1): (this.age +=2);
	}
	
	String getInfo() {
		String message;
		if(!this.hasScolarship) {
			return "no scolarship";
		}
		if(this.hasScolarship) {
			return "the student has a scolarship";
		}
		else {
			return "no scolarship";
		}
	}
	
	public int aSimpleFunction() {
		return 10;
	}
}
