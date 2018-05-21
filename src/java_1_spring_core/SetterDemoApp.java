package java_1_spring_core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCricketCoach.getDailyFortune());
        System.out.println(theCricketCoach.getDailyWorkout());
    }

}
