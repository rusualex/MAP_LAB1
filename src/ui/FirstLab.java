package ui;
import repository.RepoStudent;


public class FirstLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		RepoStudent alex;
		alex = new RepoStudent();
		alex.setStudMatrNr(1);
		alex.setStudName("Alex");
		alex.setStudSem(1);
		alex.setStudGrade(10);
		System.out.println(alex.getStudPrinter());
		
		alex.createStudent(5, "Andrei", 1, 8); 
		alex.createStudent(3, "Ana", 2, 6); 
		alex.createStudent(2, "Rey", 1, 5); 
		alex.createStudent(4, "Geo", 1, 3); 
		alex.printStudentRepo();
		alex.deleteStudent(4);
		alex.printStudentRepo();
		
		
	}

}
