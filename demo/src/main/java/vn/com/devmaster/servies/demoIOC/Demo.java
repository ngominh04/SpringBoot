package vn.com.devmaster.servies.demoIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    @Autowired
    private  Person person;

    public void displayDemo(){
        person.wear();
    }
}
