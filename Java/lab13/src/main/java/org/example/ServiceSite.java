package org.example;

public class ServiceSite implements IServiceSite{
    @Override
    public void connectionByLogin(String login) {
        System.out.println("You connect to site by login "+login+", connection succesfull\n");
    }
}
