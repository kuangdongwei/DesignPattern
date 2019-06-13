package model.strategy;

import java.util.ArrayList;

public class Client {

	public static void main(String args[]) {
		
		ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("zhangsan", 18, 5866));
        list.add(new Person("zhangsan", 25, 5863));
        list.add(new Person("lisi", 19, 5867));
        list.add(new Person("wangwu", 26, 5868));
        list.add(new Person("wangwu", 29, 5833));
        list.add(new Person("kuangdongwei",24,6666));

        SortByName sbn = new SortByName();
        Environment environment = new Environment(sbn, list);
        list = environment.sortbyName();

        System.out.println("按姓名排序：");
        for (int i = 0; i < list.size(); i++)
        {
            Person person = list.get(i);
            System.out.println("姓名：" + person.getName() + "   年龄："
                    + person.getAge() + "  学号：" + person.getId());
        }
    
	}
}
