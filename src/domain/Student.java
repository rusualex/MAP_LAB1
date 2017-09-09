/**
 * 
 */
package domain;

/**
 * @author Alex
 *
 */
public class Student {
	private int studMatrNr;
	private String studName;
	private int studSem;
	private int studGrade;
	
	public Student(){};
	
	public Student(int studMatrNr, String studName, int studSem, int studGrade){
		this.studMatrNr = studMatrNr;
		this.studName = studName;
		this.studSem = studSem;
		this.studGrade = studGrade;
	}
	
	public String getStudPrinter(){
		return studMatrNr + " " + studName + " " + studSem + " " + studGrade + "\n"; 
	}
	
	
	/**
	 * @return the studMatrNr
	 */
	public int getStudMatrNr() {
		return studMatrNr;
	}
	/**
	 * @param studMatrNr the studMatrNr to set
	 */
	public void setStudMatrNr(int studMatrNr) {
		this.studMatrNr = studMatrNr;
	}
	/**
	 * @return the studName
	 */
	public String getStudName() {
		return studName;
	}
	/**
	 * @param studName the studName to set
	 */
	public void setStudName(String studName) {
		this.studName = studName;
	}
	/**
	 * @return the studSem
	 */
	public int getStudSem() {
		return studSem;
	}
	/**
	 * @param studSem the studSem to set
	 */
	public void setStudSem(int studSem) {
		this.studSem = studSem;
	}
	/**
	 * @return the studGrade
	 */
	public int getStudGrade() {
		return studGrade;
	}
	/**
	 * @param studGrade the studGrade to set
	 */
	public void setStudGrade(int studGrade) {
		this.studGrade = studGrade;
	}
}
