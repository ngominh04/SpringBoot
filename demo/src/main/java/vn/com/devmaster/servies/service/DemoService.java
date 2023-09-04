package vn.com.devmaster.servies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.devmaster.servies.DTO.StudentDTO;
import vn.com.devmaster.servies.domain.Student;
import vn.com.devmaster.servies.mapper.StudentMapper;
import vn.com.devmaster.servies.reponsitory.DemoRepoonsitory;

import java.util.List;

@Service
public class DemoService {
    @Autowired
    private DemoRepoonsitory demoRepoonsitory;

    @Autowired
    private StudentMapper studentMapper;
    public List<StudentDTO> getAllStudent(){
       List<Student> list= demoRepoonsitory.getAll();
        return studentMapper.toDTO(list);
    }

    public StudentDTO getOne(String username){
        Student student = demoRepoonsitory.getOne(username);
        return studentMapper.toDTO(student);
    }
}
