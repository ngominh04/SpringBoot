package vn.com.devmaster.servies.mapper;

import org.springframework.stereotype.Component;
import vn.com.devmaster.servies.DTO.StudentDTO;
import vn.com.devmaster.servies.domain.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentMapper {

    public StudentDTO toDTO(Student entity){
        StudentDTO dto = StudentDTO.builder()
                .name(entity.getFirstName()+" "+entity.getLastName())
                .address(entity.getAddess())
                .age(entity.getAge())
                .username(entity.getUserName())
                .build();
        return dto;
    }
    public List<StudentDTO> toDTO(List<Student> entitys){
        List<StudentDTO> dtos = new ArrayList<>();
        entitys.forEach(student -> {
            StudentDTO dto = toDTO(student);
            dtos.add(dto);
        });
        return dtos;
    }
}
