package myconsultantinc.com;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class LegacyWS {
    private final String message = "Up, and working...";

    public LegacyWS(){

    }

    @WebMethod
    public String autoReply(String clientName){
        return message + " " + clientName;
    }
}
