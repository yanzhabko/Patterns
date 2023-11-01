package org.example;

public class Main {
    public static void main(String[] args) {
        ProxyServiceSite proxyServiceSite=new ProxyServiceSite();
        proxyServiceSite.connectionByLogin("pomer");
        proxyServiceSite.connectionByLogin("Roma");
        proxyServiceSite.connectionByLogin("banned");
        proxyServiceSite.connectionByLogin("Roma");
        proxyServiceSite.connectionByLogin("ne pomer");
        proxyServiceSite.connectionByLogin("Roma");
        proxyServiceSite.connectionByLogin("Ne Roma");
    }
}