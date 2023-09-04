package vn.com.devmaster.servies.demoIOC;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Person{
    @Override
    public void wear() {
        System.out.println("Girl wear dress");
    }
}
