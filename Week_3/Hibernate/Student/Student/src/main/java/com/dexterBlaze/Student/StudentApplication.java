package com.dexterBlaze.Student;

import com.dexterBlaze.Student.entity.Student;
import com.dexterBlaze.Student.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentApplication {
	public static void main(String[] args) {
        //fetch a bean in the spring framework
		ApplicationContext context = SpringApplication.run(StudentApplication.class, args);
        StudentService studentService  = context.getBean(StudentService.class);
//        Student student = new Student("Elon Musk","College Dropout");
//        studentService.save(student);
        Student student1 = new Student("Mr.Singh","12th dropout");
        studentService.save(student1);
	}
}
