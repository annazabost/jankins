package pl.stormit;

import javax.ejb.Stateless;

@Stateless
public class TimeService {

    public String time(){
        return System.currentTimeMillis() + "";
    }

}
