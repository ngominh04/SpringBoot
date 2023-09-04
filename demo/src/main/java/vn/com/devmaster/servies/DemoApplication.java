package vn.com.devmaster.servies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import vn.com.devmaster.servies.demoConfig.ManagerStudent;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
//		Demo demo = context.getBean(Demo.class);
//		demo.displayDemo();

//		ManagerStudent managerStudent = context.getBean(ManagerStudent.class);
//		managerStudent.getStudents().forEach(student -> {
//			System.out.println(student.toString());
//		});



	}
}
