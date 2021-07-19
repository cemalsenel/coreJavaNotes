package warm_up_01;

public class Student implements Comparable<Student> {
	
	int id;
	String name = new String();
	double cgpa;
	
	public Student(String name, double cgpa, int id) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	};
	
// ------------------------------------------
	// "er".compareTo("fr"); -1
	public int compareTo(Student s) {
		
		if ( cgpa == s.cgpa) {
			
			if ( name.compareTo(s.name) == 0) {
				if ( id == s.id) return 0;
				else if ( id > s.id) return 1;
				else return -1;
			}
			else return name.compareTo(s.name);
		}
		else if ( cgpa > s.cgpa) return -1;
		else return 1;
	}
}