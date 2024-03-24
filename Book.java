class Book
{
	String name;
	String author;
	String type;
	String publication;
	String language;

	Book(String name,String author,String type,String publication,String language)
	{
		this.name = name;
		this.author = author;
		this.type = type;
		this.publication = publication;
		this.language = language;
	}
	public void displayBook()
	{
		System.out.println("****Book Details****");
		System.out.println("Name : " + this.name);
		System.out.println("Author : " + this.author);
		System.out.println("Type : " + this.type);
		System.out.println("Publication : " + this.publication);
		System.out.println("Languagae : " + this.language);
		System.out.println();
	}
}