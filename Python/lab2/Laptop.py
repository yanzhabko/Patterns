import copy


class Laptop:
    __screen: str = ''
    __ports: str = ''
    __memory: str = ''
    __cpu: str = ''
    __gpu: str = ''

    def __init__(self, screen, ports, memory, cpu, gpu):
        self.__screen = screen
        self.__ports = ports
        self.__memory = memory
        self.__cpu = cpu
        self.__gpu = gpu

    def set_screen(self, screen):
        self.__screen = screen

    def set_ports(self, ports):
        self.__ports = ports

    def set_memory(self, memory):
        self.__memory = memory

    def set_cpu(self, cpu):
        self.__cpu = cpu

    def set_gpu(self, gpu):
        self.__gpu = gpu

    def get_screen(self):
        return self.__screen

    def get_ports(self):
        return self.__ports

    def get_memory(self):
        return self.__memory

    def get_cpu(self):
        return self.__cpu

    def get_gpu(self):
        return self.__gpu


    def clone(self):
        return Laptop(self.__screen,self.__ports,self.__memory,self.__cpu,self.__gpu)


    def toString(self):
        return "laptop{screen='" + self.__screen + "', ports='" + self.__ports + "', memory='" + self.__memory \
            + "', cpu='" + self.__cpu + "', gpu='" + str(self.__gpu) + "'}"
