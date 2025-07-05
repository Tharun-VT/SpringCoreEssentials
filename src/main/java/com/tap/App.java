package com.tap;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.tap.models.Student;

public class App {
    public static void main(String[] args) {
        // Load Spring configuration from bean.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        System.out.println(context);

        // Get the Student bean from the Spring container
        Student student = (Student) context.getBean("student");//class name(Student.class) or else id("student")
        System.out.println(student);

        // Call Student methods
        student.studying();
        student.bunking();
        student.graduating();

        // Close the Spring context
        context.close();
    }
}
