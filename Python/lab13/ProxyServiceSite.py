from IServiceSite import IServiceSite
from ServiceSite import ServiceSite

class ProxyServiceSite(IServiceSite):
    banned_login = ["banned", "pomer", "ne pomer"]

    def __init__(self):
        self.not_banned_login = []
        self.service_site = ServiceSite()

    def connection_by_login(self, login):
        if login in self.banned_login:
            print("You are banned\n")
        else:
            if login in self.not_banned_login:
                self.service_site.connection_by_login(login)
            else:
                self.not_banned_login.append(login)
                print("Your registry successful and authorization continues")
                self.service_site.connection_by_login(login)
