package model.strategy;

import java.util.ArrayList;

public class SortByName implements Strategy1 {

	@SuppressWarnings("unchecked")
	@Override
		public ArrayList<Person> sort(ArrayList<Person> list)
	    {
	        list.sort(new NameComparator());
	        return list;
	    }
	
}