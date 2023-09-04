package vn.com.devmaster.servies.demoIOC;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BOy implements Person{
    @Override
    public void wear() {
        System.out.println("Boy wear dress");
    }
}
