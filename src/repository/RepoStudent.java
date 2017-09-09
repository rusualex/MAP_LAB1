/**
 * 
 */
package repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain.Student;

/**
 * @author Alex
 *
 */
public class RepoStudent extends Student {
	private List<Student> studList = new ArrayList<Student>();
	private int i=0;
	
	
	
	
	public void createStudent(int studMatrNr, String studName, int studSem, int studGrade) {
		Student newStudent = new Student(studMatrNr, studName, studSem, studGrade);
		studList.add(newStudent);
	}
	
	public void deleteStudent(int studMatrNr){
		for (Iterator<Student> iter = studList.listIterator(); iter.hasNext(); ) {
		    Student removeCond = iter.next();
		    if (removeCond.getStudMatrNr() == studMatrNr) {
		        iter.remove();
		    }
		}
	}
	
	public void updateStudent(int studMatrNr, String studName, int studSem, int studGrade){
		for (Student stud : studList) {
			if (stud.getStudMatrNr() == studMatrNr)
			{
				stud.setStudName(studName);
				stud.setStudSem(studSem);
				stud.setStudGrade(studGrade);
			}
		}
		
	}
	
	public void printStudentRepo(){
		for (Student stud : studList) {
			   System.out.println("Studentul [" + i++ +"]: " + stud.getStudPrinter());
			}
		i=0;
	}
}
