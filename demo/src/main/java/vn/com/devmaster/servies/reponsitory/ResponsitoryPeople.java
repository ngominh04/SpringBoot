package vn.com.devmaster.servies.reponsitory;

import org.springframework.stereotype.Repository;
import vn.com.devmaster.servies.domain.People;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResponsitoryPeople {
    public List<People> get(String userName,String passWord){
        People people1 = People.builder().firrtName("Ngô").lastName("A").userName(userName).passWord(passWord).build();
        People people2 = People.builder().firrtName("Nguyễn").lastName("B").userName(userName).passWord(passWord).build();
        People people3 = People.builder().firrtName("Trần").lastName("C").userName(userName).passWord(passWord).build();
        List<People> peopleList= new ArrayList<>();
        peopleList.add(people1);
        peopleList.add(people2);
        peopleList.add(people3);
        return peopleList;
    }
}
