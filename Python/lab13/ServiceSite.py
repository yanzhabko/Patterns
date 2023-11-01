from IServiceSite import IServiceSite

class ServiceSite(IServiceSite):
    def connection_by_login(self, login: str):
        print('You connect to site by login ' + login + ', connection succesfull\n')
