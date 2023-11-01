from abc import ABC, abstractmethod


class IServiceSite(ABC):
    @abstractmethod
    def connection_by_login(self, login: str):
       pass
