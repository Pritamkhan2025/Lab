package com;

public class Teacher {
	String designation ="Teacher";
	String collegename ="RERF";
	void work() {
		System.out.println("Teaching");
	}

}
class ITTeacher extends Teacher{
	public static void main(String args[]) {
		ITTeacher obj= new ITTeacher();
		obj.work();
		System.out.println(obj.designation);
		System.out.println(obj.collegename);
	}
}

