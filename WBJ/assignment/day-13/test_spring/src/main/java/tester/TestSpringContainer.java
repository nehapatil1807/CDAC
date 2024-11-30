package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import dependent.PublicSchool;

public class TestSpringContainer {
	public static void main(String[] args) {
		// start sc(spring container) in a standalone application,
		//using xml based instructions, loaded from runtime class path
		try(ClassPathXmlApplicationContext contex = 
				new ClassPathXmlApplicationContext("bean_config.xml")){
			System.out.println("Spring Container is up and running !");
			//exec B.L. - manage academy
			PublicSchool school1 = contex.getBean("public_school", PublicSchool.class);           
			//B.L.
			school1.manageAcademics();
			school1.organizeSportsEvent();
			PublicSchool school2 = contex.getBean("public_school", PublicSchool.class);
			System.out.println(school1 == school2); //true since its singleton
			//jvm-contex.close()=>SC shutting down
			//check for singleton beans->invoke destroy method,if present->
			//bean will be marked GC
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
