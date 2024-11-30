package com.myschool.dependency;
//prototype with bean id="sc"

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sc")
@Scope(value="prototype")
public class ScienceTeacher implements Teacher {
	public ScienceTeacher() {
		System.out.println("In constructor - " + getClass());
	}

	@Override
	public void teach() {
		System.out.println("Learn Science through experiments !");
	}

}
