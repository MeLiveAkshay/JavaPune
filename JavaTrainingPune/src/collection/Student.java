package collection;

public class Student implements Comparable<Student>
{
	
	private int rollNo;
	private String name;
	private float percentage;
	
	
	
	
	
	
	public Student()
	{
		
	}

	
	
	





	public Student(int rollNo, String name, float percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}



	





	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}









	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}









	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}









	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}









	/**
	 * @return the percentage
	 */
	public float getPercentage() {
		return percentage;
	}









	@Override
	public String toString() {
	    return "{\n" +
	           "  \"rollNo\": " + rollNo + ",\n" +
	           "  \"name\": \"" + name + "\",\n" +
	           "  \"percentage\": " + percentage + "\n" +
	           "}";
	}










	/**
	 * @param percentage the percentage to set
	 */
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}


/*
	@Override
	public int compareTo(Object o)
	{
		/**
		if(o instanceof Student)
		{
			Student student=(Student) o;
			if(this.rollNo > student.rollNo)
			{
				return 1;
			}
			else if (this.rollNo < student.rollNo)
			{
				return -1;
			}
		}
		return 0;
		**/
		
		
		/**
		if(o instanceof Student) {
			Student student=(Student) o;
			return this.name.compareTo(student.name);
		}
		return 0;
		**/
		
	//}




	@Override
	public int compareTo(Student o)
	{
		return this.name.compareTo(o.name);
		
	}
	
}
