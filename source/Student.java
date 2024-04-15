
public class Student {
	static int studentCount;
	String name;
	  String gender;
	int id;
	int age;
	long phone;
	double gpa;
	char degree;
	boolean international;
	double tuitionFees=12000.0;
	double internationalFees=5000.0;
	 Student(int id, String name, String gender, int age, long phone, double gpa, 
				char degree) {		  
   this(id, name, gender, age, phone, gpa, degree, false);
}
	 Student(int id, String name, String gender, int age, long phone, double gpa, 
				char degree, boolean international){
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.phone=phone;
		this.gpa=gpa;
		this.degree=degree;
		this.international = international;
		
		
		
	 
			
	 studentCount = studentCount + 1;
	  int nextId = id + 1;		  
	  
	  if (international) {
	      tuitionFees = tuitionFees + internationalFees;
		  //return;
	  }		

		System.out.println("\nid: " + id);
		  System.out.println("nextId: " + nextId);
		  System.out.println("name: " + name);
		  System.out.println("gender: " + gender);
		  System.out.println("age: " + age);
		  System.out.println("phone: " + phone);
		  System.out.println("gpa: " + gpa);
		  System.out.println("degree: " + degree);
		  System.out.println("tuitionFees: " + tuitionFees);
		  System.out.println("studentCount: " + studentCount);

			}
	// Student() {}
	 Student() {}
	  
	  boolean updateProfile(String name) {
	      this.name = name;
		  return true;
	  }
	
			

}
