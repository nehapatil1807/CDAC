package com.myschool.dependency;

import org.springframework.stereotype.Component;

//singleton n eager spring component=spring bean
@Component("eng")//=> to tell SC , following is the spring bean , 
//whose life cycle is to be managed by SC -mandatory
public class EnglishTeacher implements Teacher {
	public EnglishTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Practice English Grammar");
	}

}
