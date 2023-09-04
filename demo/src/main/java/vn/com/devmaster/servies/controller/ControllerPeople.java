package vn.com.devmaster.servies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.com.devmaster.servies.DTO.PeopleDTO;
import vn.com.devmaster.servies.service.ServicePeople;

import java.util.List;

@RestController
public class ControllerPeople {
    @Autowired
    private ServicePeople servicePeople;

    @RequestMapping(method = RequestMethod.GET,value = "peoples")
    List<PeopleDTO> peopleDTOS(@RequestParam("userName") String userName,@RequestParam("passWord") String passWord)
    {return servicePeople.get(userName,passWord);}

}
