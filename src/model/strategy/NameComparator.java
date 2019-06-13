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
         * o1��o2��Ӧ�ļ���������������Person������ֱ�������Ƚ�
         * ��ʱҪ�Ƚϵ���name���ԣ����ȡ������ֵ�ٽ��бȽ�
         */
        Person person1 = (Person) o1;
        Person person2 = (Person) o2;
        String str1 = person1.getName();
        String str2 = person2.getName();
        //��������ͬ����ͨ��id��������
        if(str1.compareTo(str2) == 0)
        {
            return person1.getId() - person2.getId();
        }
        return str1.compareTo(str2);
    }
}
