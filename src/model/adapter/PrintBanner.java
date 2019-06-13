package model.adapter;

public class PrintBanner extends Banner implements Print{

	public PrintBanner(String transilator)
	{
		super(transilator);
	}
	public void printWeak()
	{
		showWithAster();
	}
	public void printStrong()
	{
		showWithParen();
	}
}
