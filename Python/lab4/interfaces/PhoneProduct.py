from abc import ABCMeta, abstractmethod

class PhoneProduct(metaclass=ABCMeta):
    @abstractmethod
    def show_phone_catalog(self):
        pass
