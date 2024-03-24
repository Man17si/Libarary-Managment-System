class Student
{
	static int uniqueId = 1;
	String name;
	int id;
	String gender;
	long contactNumber;
	String address;
	String department;

	Student(String name,String gender, long contactNumber, String address, String department)
	{
		this.name = name;
		this.id = uniqueId++;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.address = address;
		this.department = department;
	}
	public void displayStudent()
	{
		System.out.println("****Student Details****");
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Gender : "+ this.gender);
		System.out.println("contactNumber : " +this.contactNumber);
		System.out.println("Address : " + this.address);
		System.out.println("Department : " + this.department);
		System.out.println();
	}
}
