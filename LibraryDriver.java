class LibraryDriver
{
	public static void main(String[] args)
	{
		System.out.println("**Welcome Here To Study**");
		Book book = new Book("Chava", "Shivaji Sawant","Kadambari","Sawant Publisher","Marathi");
		Library library = new Library("Aspire",6,12d,500,"Deccan-Pune", 9881488977l,book);
		library.displayLibrary();
		library.book.displayBook();
		library.addLibrarian();
		library.librarian.displayLibrarian();
		library.addShelf();
		library.shelf.displayShelf();
		library.addStudent();
		library.student.displayStudent();
	}
}










/*class LibraryDriver2
{
	public static void main(String[] args) 
	{
		LibraryDriver a = new LibraryDriver();
		a.displayLibraryDriver();
	}
}*/