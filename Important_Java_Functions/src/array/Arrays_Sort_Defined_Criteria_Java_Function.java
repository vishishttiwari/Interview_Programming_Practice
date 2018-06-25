package array;
import java.util.Arrays;
import java.util.Comparator;

public class Arrays_Sort_Defined_Criteria_Java_Function {
	// A class to represent a student.
	class Student
	{
	    int rollno;
	    String name, address;
	 
	    // Constructor
	    public Student(int rollno, String name,
	                               String address)
	    {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	 
	    // Used to print student details in main()
	    public String toString()
	    {
	        return this.rollno + " " + this.name +
	                           " " + this.address;
	    }
	}
	
	/*
	 * The compare Method
		int compare(Object obj1, Object obj2)
		obj1 and obj2 are the objects to be compared. 
		This method returns zero if the objects are equal. 
		It returns a positive value if obj1 is greater than obj2. Otherwise, a negative value is returned.
	 */
	 
	class SortbyrollAscending implements Comparator<Student>
	{
	    // Used for sorting in ascending order of
	    // roll number
	    public int compare(Student a, Student b)
	    {
	        return a.rollno - b.rollno;
	    }
	}
	
	class SortbyrollDescending implements Comparator<Student>
	{
	    // Used for sorting in descending order of
	    // roll number
	    public int compare(Student a, Student b)
	    {
	        return b.rollno - a.rollno;
	    }
	}
	
	class SortbynameAscending implements Comparator<Student>
	{
	    // Used for sorting in ascending order of
	    // roll name
	    public int compare(Student a, Student b)
	    {
	        return a.name.compareTo(b.name);
	    }
	}
	
	class SortbynameDescending implements Comparator<Student>
	{
	    // Used for sorting in descending order of
	    // roll name
	    public int compare(Student a, Student b)
	    {
	        return b.name.compareTo(a.name);
	    }
	}
	
	// Driver class
	class Sort
	{
	    public void sort()
	    {
	        Student [] arr = {new Student(111, "bbbb", "london"),
	                          new Student(131, "aaaa", "nyc"),
	                          new Student(121, "cccc", "jaipur")};
	 
	        Arrays.sort(arr, new SortbyrollAscending());
	        Arrays.sort(arr, new SortbyrollDescending());
	        Arrays.sort(arr, new SortbynameAscending());
	        Arrays.sort(arr, new SortbyrollDescending());
	    }
	}
}
