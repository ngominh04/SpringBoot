package vn.com.devmaster.servies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.com.devmaster.servies.DTO.PeopleDTO;
import vn.com.devmaster.servies.domain.People;
import vn.com.devmaster.servies.mapper.MapperPeople;
import vn.com.devmaster.servies.reponsitory.ResponsitoryPeople;

import java.util.List;

@Service
public class ServicePeople {
    @Autowired
    private ResponsitoryPeople responsitory;
    @Autowired
    private MapperPeople mapper;

    public List<PeopleDTO> get(String userName,String passWord){
        List<People> peopleList=responsitory.get(userName,passWord);
        return mapper.toDto(peopleList);
    }
}
