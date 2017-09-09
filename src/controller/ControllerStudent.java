package controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import domain.Student;
import repository.RepoStudent;

public class ControllerStudent extends RepoStudent{
	private int i=0;
	
	public void studFilterGrade(int studGrade){
		for (Student stud : studList) {
			if(stud.getStudGrade() >= studGrade)
				 System.out.println(getStudPrinter());
		}
	}
	
	public void studNameSort(){
		List<Student> aux = new ArrayList<Student>(studList);
		aux.sort(Comparator.comparing(Student::getStudName));
		this.printStudentRepo(aux);
	}
	
	public void printStudentRepo(List<Student> auxList){
		for (Student stud : auxList) {
			   System.out.println("Studentul [" + i++ +"]: " + stud.getStudPrinter());
			}
		i=0;
	}
	
}
