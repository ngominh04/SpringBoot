package vn.com.devmaster.servies.reponsitory;

import org.springframework.stereotype.Repository;
import vn.com.devmaster.servies.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DemoRepoonsitory {
    public List<Student> getAll(){
        Student student = Student.builder().firstName("Ngô").lastName("Minh").age(19).addess("Hà nội").userName("AAAAAAAAAAAAA").password("12345").build();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student);
        studentList.add(student);
        return studentList;
    }
    public Student getOne(String username){
        Student student = Student.builder().firstName("Ngô").lastName("Minh").age(19).addess("Hà nội").userName(username).password("12345").build();
        return student;
    }
}
