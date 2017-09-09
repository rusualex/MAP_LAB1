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
	}

}
