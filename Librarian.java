class Librarian
{
	String name;
	String gender;
	long contactNumber;
	String address;
	String shift;

	Librarian(String name, String gender, long contactNumber, String address, String shift)
	{
		this.name = name;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.address = address;
		this.shift = shift;
	}

	public void displayLibrarian()
	{
		System.out.println("****Librarian Details****");
		System.out.println("Name : " +this.name);
		System.out.println("Gneder : " +this.gender);
		System.out.println("contactNumber : " +this.contactNumber);
		System.out.println("Address : " + this.address);
		System.out.println("Shift : " + this.shift);
	}
}