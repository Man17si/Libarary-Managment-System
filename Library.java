class Library
{
	String name;
	double startTime;
	double endTime;
	double fees;
	String address;
	long contactNumber;
	Book book;
	Librarian librarian;
	Shelf shelf;
	Student student;
  
   Library(String name, double startTime, double endTIme, double fees, String address, long contactNumber,Book book)
   {
   	this.name = name;
   	this.startTime = startTime;
   	this.endTime = endTime;
   	this.fees = fees;
   	this.address = address;
   	this.contactNumber = contactNumber;
   	this.book = book;
   }
   public void displayLibrary()
   {
   	System.out.println("****Library Details****");
   	System.out.println("Name : " + this.name);
   	System.out.println("Address : " + this.address);
   	System.out.println("Fees : " + this.fees);
   	System.out.println("Timings : " + this.startTime+ " am - "+this.endTime+" pm");
   	System.out.println("Contact Number : "+ this.contactNumber);
   	System.out.println();
   }
   public void addLibrarian()
   {
   	String name = "Ramesh";
   	String gender = "Male";
   	long contactNumber = 7776957629l;
   	String address = "KarveNagar";
   	String shift = "Day";
   	librarian = new Librarian(name,gender,contactNumber,address,shift);
   }
   public void addShelf()
   {
   	String type = "Historic";
   	int capacity = 150;
   	shelf = new Shelf(type,capacity);
   }
   public void addStudent()
   {
   	String name = "Suresh";
   	String gender = "Male";
   	long conatctNumber = 9822319976l;
   	String address = "Kothrud";
   	String department = "Mechanical";

   	student = new Student(name,gender,contactNumber, address, department);
   }

}