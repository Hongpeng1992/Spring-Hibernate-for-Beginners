package SpringDemo.springCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/SpringDemo/applicationContext.xml");
        CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
        System.out.println(theCricketCoach.getEmail() + "\n" + theCricketCoach.getTeam());
    }

}
