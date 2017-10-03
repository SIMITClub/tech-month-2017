public class Student {

	private String name;
	private String studentNumber;
	private int mark;
	
	// Default Constructor and Multiple Constructor
	public Student() {
		this.name = "";
		this.studentNumber = "";
		this.mark = 0;
	}
	
	public Student(String name, String studentNumber, int mark) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.mark = mark;
	}
	
	/** Method of Accessor **/
	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	/** Method of Mutator **/
	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	/** Normal Method **/
	public void result() {
		System.out.println( name + " (" + studentNumber +")'s result mark is " + mark);
	}
}

