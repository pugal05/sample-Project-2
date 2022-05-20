package org.abs;

public class School extends Students {

	private void schoolName() {
		String name="GHSS";
		System.out.println("School neme is:"+ name);
	}

	public static void main(String[] args) {
		School s = new School();
		s.studentId();
		s.schoolName();
		System.out.println("***********");
		
		// Error Students a=new Students();
		
		Students a=new School();
		s.studentId();
		s.schoolName();
		System.out.println("*******");
		
		// Error School c=new Students();
		
		

	}

}
