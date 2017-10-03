import java.util.ArrayList;

public class studentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create object with using 3 parameters in constructor and two object as default constructor
		Student stud1 = new Student("Makus", "M1234567", 60);
		Student stud2 = new Student();
		Student stud3 = new Student();
		
		// modify the variable(Name and mark) in stud3 object
		stud3.setName("John");
		stud3.setMark(90);
		
		// Declare and create ArrayList Object based on Student Type
		// and add the three student object
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(stud1);
		studentList.add(stud2);
		studentList.add(stud3);
		
		// Execute the each student's method(main features)
		for(int i=0; i<studentList.size(); i++)
			studentList.get(i).result();
	}

}
