package model.strategy;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public class NameComparator implements Comparator{

	public NameComparator() {
		super();
		
	}
	@Override
    public int compare(Object o1, Object o2)
    {
        /*
         * o1和o2对应的即是两个传进来的Person，不能直接拿来比较
         * 此时要比较的是name属性，因此取出属性值再进行比较
         */
        Person person1 = (Person) o1;
        Person person2 = (Person) o2;
        String str1 = person1.getName();
        String str2 = person2.getName();
        //若姓名相同，则通过id升序排序
        if(str1.compareTo(str2) == 0)
        {
            return person1.getId() - person2.getId();
        }
        return str1.compareTo(str2);
    }
}
