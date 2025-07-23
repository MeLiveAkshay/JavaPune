package collection;

import java.util.Comparator;

public class StudentComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Student && o1 instanceof Student)
		{
			Student student1=(Student) o1;
			Student student2=(Student) o2;
			if(student1.getRollNo() > student2.getRollNo())
			{
				return 1;
			}
			else if (student1.getRollNo() < student2.getRollNo())
			{
				return -1;
			}
		}
		
		return 0;
	}

	

}
