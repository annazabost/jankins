package pl.stormit;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class GreeterFacade {

    @Inject
    TimeService timeService;

    public String greet(String name) {
        return "Hello: " + name + ", " + timeService.time();
    }

    @PostConstruct
    public void init(){
        System.out.println("hello");
    }
}
