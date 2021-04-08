package predicates;
import java.util.ArrayList;
import java.util.function.Predicate;

class Student{
	int stuId;
	String stuName;
	int stuAge;
	
	public Student(int stuId, String stuName, int stuAge) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAge = stuAge;
	}
}

public class PredicateStudentEg {
	public static void main(String[] args) {
		
		ArrayList<Student> obj = new ArrayList<Student>();
		obj.add(new Student(201, "saran", 20));
		obj.add(new Student(204, "Moni", 22));
		obj.add(new Student(205, "Dev", 12));
		
		Predicate<Student> p = (age) -> {
		if(age.stuAge > 18){
			//System.out.println("Allowed to Watch Movie");
		return true;
		}
		else {
			//System.out.println("Not Allowed to Watch Movie");	
		return false;
		}
	};
		
		for(Student age : obj) {
			if(p.test(age)) {
				System.out.println("Student Name - " +age.stuName+ " Student Age - " +age.stuAge );
				System.out.println("The Student Name his/her age is (above 18) -- "+age.stuName);
				System.out.println("Allowed to Watch Movie");
				System.out.println();
			}
			else if
				(!(p.test(age))){
				System.out.println("Student Name - " +age.stuName+ " Student Age - " +age.stuAge );
				System.out.println("Not Allowed to Watch Movie");
			}
		}
  }
}

