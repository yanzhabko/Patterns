from ProxyServiceSite import ProxyServiceSite

if __name__ == '__main__':
    proxyServiceSite: ProxyServiceSite = ProxyServiceSite()
    proxyServiceSite.connection_by_login("power")
    proxyServiceSite.connection_by_login("Name")
    proxyServiceSite.connection_by_login("banned")
    proxyServiceSite.connection_by_login("Name")
    proxyServiceSite.connection_by_login("no power")
    proxyServiceSite.connection_by_login("Name")
    proxyServiceSite.connection_by_login("No Name")

