package SpringDemoAnnotations.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Oleksandr
 */
public class AnnotationDemoApp {

    public static void main(String[] args) {

        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("file:src/SpringDemoAnnotations/applicationContext.xml");

        //get the bean from spring container
       Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        //call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        //close the context
        context.close();
    }

}
