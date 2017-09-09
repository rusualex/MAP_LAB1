/**
 * 
 */
package repository;

import java.util.ArrayList;
import java.util.List;

import domain.Student;

/**
 * @author Alex
 *
 */
public class RepoStudent extends Student {
	List<Student> studList = new ArrayList<Student>();
	public void createStudent(int studMatrNr, String studName, int studSem, int studGrade) {
		Student newStudent = new Student(studMatrNr, studName, studSem, studGrade);
		studList.add(newStudent);
	}
	
	public void printStudentRepo(){
		for (Student stud : studList) {
			   System.out.println("Next item: " + stud.getStudPrinter());
			}
	}
}
