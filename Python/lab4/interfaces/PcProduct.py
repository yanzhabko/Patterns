from abc import ABCMeta, abstractmethod

class PcProduct(metaclass=ABCMeta):
    @abstractmethod
    def show_pc_catalog(self):
        pass
