package vn.com.devmaster.servies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.devmaster.servies.DTO.StudentDTO;
import vn.com.devmaster.servies.domain.Student;
import vn.com.devmaster.servies.service.DemoService;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping(method = RequestMethod.GET,value = "/Student")
    List<StudentDTO> getStudents(){
        return demoService.getAllStudent();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/Student1")
    StudentDTO studentDTO(@RequestParam("username") String username){
        return demoService.getOne(username);
    }
}
