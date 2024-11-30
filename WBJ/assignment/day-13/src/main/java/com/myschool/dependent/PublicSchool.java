package com.myschool.dependent;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.myschool.dependency.Coach;
import com.myschool.dependency.Teacher;
//singleton n eager , id=public_school,maths teacher n football coach
//init n destroy called !
@Component("public_school")
public class PublicSchool implements School {
	@Autowired //
	@Qualifier("mathsTeacher") //byName : Field level D.I
	private Teacher subjectTeacher;// mandatory
	@Autowired
	@Qualifier("football") //byName - Field level D.I
	private Coach sportsCoach;// optional

	
	public PublicSchool() {			
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();// using the dependency to exec B.L
	}

	@Override
	public void organizeSportsEvent() {
		System.out.println("organizing sports event !");
		System.out.println(sportsCoach.getDailyWorkout());//using the dependency to exec B.L
	}



	// add custom init method
	@PostConstruct //=> SC will auto call below method - after D.I
	public void anyInit() // throws Exception
	{
		System.out.println("in init " + getClass());
	}

	// add custom destroy method
	@PreDestroy //=> SC will auto calls below method  ,for singleton beans , 
	//just before Garbage collection bean instance
	public void anyDestroy() // throws Exception
	{
		System.out.println("in destroy " + getClass());
	}	

}
