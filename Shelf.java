class Shelf
{
	String type;
	int capacity;
   
   Shelf(String type, int capacity)
   {
   	this.type = type;
   	this.capacity = capacity;
   }
   public void displayShelf()
   {
   	System.out.println("***shelf details***");
   	System.out.println("Type Of Book : " +this.type);
   	System.out.println("Capacity : " + this.capacity);
   	System.out.println();
   }

}