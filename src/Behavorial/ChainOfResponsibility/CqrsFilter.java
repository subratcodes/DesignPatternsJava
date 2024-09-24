package Behavorial.ChainOfResponsibility;

import Behavorial.ChainOfResponsibility.Servlet.Request;

public class CqrsFilter extends Middleware {

    @Override
    public boolean check(Request req) {
        // TODO Auto-generated method stub
        if(!req.getHeaders().containsKey("CQRS")) return false;
    
        return checkNext(req);
    }

    
}
