package net.bounceme.doge.ejb;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import static java.lang.System.out;

public class CorbaClient {

    public static void main(String[] args) throws NamingException {
        InitialContext context = new InitialContext();
        out.println(context.getEnvironment().toString());
        NewSessionBeanRemoteRemote remote =  (NewSessionBeanRemoteRemote) context.lookup("net.bounceme.doge.ejb.NewSessionBeanRemoteRemote");
        out.println(remote.businessMethod());
    }

}
