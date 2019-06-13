package model.iterator;

public class Main {

	public static void main(String args[])
	{
		BookShelf bookshelf = new BookShelf(4);
		bookshelf.appendBook(new Book("c++"));
		bookshelf.appendBook(new Book("java"));
		bookshelf.appendBook(new Book("python"));
		bookshelf.appendBook(new Book("php"));
		Iterator it = bookshelf.iterator();
		while(it.hasNext())
		{
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
		
	}
}
