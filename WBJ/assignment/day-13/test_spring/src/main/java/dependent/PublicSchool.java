package dependent;

import dependency.Coach;
import dependency.EnglishTeacher;
import dependency.MathsTeacher;
import dependency.Teacher;

public class PublicSchool implements School {	
	private Teacher subjectTeacher;// = new EnglishTeacher();
	private Coach sportsCoach;
	
	//constructor based D.I - injection mandatory
	public PublicSchool(Teacher myTeacher) {
		this.subjectTeacher = myTeacher;
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();
	}
	
	public void organizeSportsEvent() {
		System.out.println("organize sports event!");
	}
	
	public void setSportsCoach(Coach sportsCoach) {
		System.out.println("In coach Sports");
		this.sportsCoach = sportsCoach;
	}

	 
	//setter based D.I
//	public void setSubjectTeacher(Teacher subjectTeacher) {
//		System.out.println("In setter");
//		this.subjectTeacher = subjectTeacher;
//	}
	
	// add custom init method
	public void anyInit() //throws Exception 
	{
		System.out.println("In init " + getClass());
	}
	public void anyDestroy() //throws Exception 
	{
		System.out.println("In Destroy " + getClass());
	}

}
