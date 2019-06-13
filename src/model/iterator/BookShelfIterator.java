package model.iterator;

public  class BookShelfIterator implements Iterator {

	private BookShelf bookshelf;
	private int index;
	public BookShelfIterator(BookShelf bookshelf)
	{
		this.bookshelf = bookshelf;
		this.index = 0;
	}
	
	public boolean hasNext()
	{
		if(index<bookshelf.getLength())
			return true;
		return false;
	}
	
	public Object next()
	{
		Book book = bookshelf.getBookat(index);
		index++;
		return book;
	}
}
