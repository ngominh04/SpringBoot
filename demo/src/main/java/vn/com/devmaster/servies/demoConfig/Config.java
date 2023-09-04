package vn.com.devmaster.servies.demoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    ManagerStudent student(){
        Student student =Student.builder().name("M").age(19).build();
        List<Student> students=new ArrayList<>();
        students.add(student);
        students.add(student);
        students.add(student);
        ManagerStudent managerStudent=new ManagerStudent();
        managerStudent.setStudents(students);
        return  managerStudent;
    }

}
