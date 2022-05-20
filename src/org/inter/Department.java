package org.inter;

public class Department implements College {

	private void departmentName() {

		String name = "Mechanical";
		System.out.println("Department name is:" + name);
	}

	@Override
	public void collegeName() {
		String name = "SRM University";
		System.out.println("College name is:"+name);
	}

	public static void main(String[] args) {
		Department d = new Department();
		d.departmentName();
		d.collegeName();
		System.out.println("*********");
		
		// Error  College c=new College();
		// Error  College c=new College()
		
		// Error  Department dep=new College();

	}

}
