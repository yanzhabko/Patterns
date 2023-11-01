package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProxyServiceSite implements IServiceSite{
    private static final List<String> bannedLogin;
    private final List<String> notBannedLogin=new ArrayList<>();
    private final ServiceSite serviceSite=new ServiceSite();
    static {
        bannedLogin=new ArrayList<>();
        bannedLogin.add("banned");
        bannedLogin.add("pomer");
        bannedLogin.add("ne pomer");
    }
    @Override
    public void connectionByLogin(String login) {
        if(bannedLogin.contains(login)){
            System.out.println("You are banned\n");
        }else {
            if(notBannedLogin.contains(login)){
                serviceSite.connectionByLogin(login);
            }else {
                notBannedLogin.add(login);
                System.out.println("Your regestry succesfull and authorisation continue");
                serviceSite.connectionByLogin(login);
            }
        }
    }
}
