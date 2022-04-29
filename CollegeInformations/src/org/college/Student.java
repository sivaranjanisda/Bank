package org.college;

public class Student extends College {
	private void studentName() {
		System.out.println("arun");

	}
     private void studentDept() {
		System.out.println("cse");

	}
     private void studentId() {
		System.out.println("yrd");

	}
     public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.studentDept();
		s.studentId();
		s.collegeName();
		s.collegeName();
		s.collegeRank();
		
	}
}
