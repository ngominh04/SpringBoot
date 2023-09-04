package vn.com.devmaster.servies.mapper;

import org.springframework.stereotype.Component;
import vn.com.devmaster.servies.DTO.PeopleDTO;
import vn.com.devmaster.servies.domain.People;

import java.util.ArrayList;
import java.util.List;

@Component
public class MapperPeople {
    public PeopleDTO toDto(People people){
        PeopleDTO peopleDTO=PeopleDTO.builder().name(people.getFirrtName()+" "+people.getLastName()).userName(people.getUserName()).passWord(people.getPassWord()).build();
        return peopleDTO;
    }
    public List<PeopleDTO> toDto(List<People> peoples){
        List<PeopleDTO> list= new ArrayList<>();
        peoples.forEach(people -> {
            PeopleDTO dto = toDto(people);
            list.add(dto);
        });
        return  list;
    }
}
