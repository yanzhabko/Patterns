import copy


class PersonalComputer:

    __outputDevice: str = ''
    __inputDevice: str = ''
    __memory: str = ''
    __cpu: str = ''
    __gpu: str = ''


    def __init__(self, outputDevice, inputDevice, memory, cpu, gpu):
        self.__outputDevice = outputDevice
        self.__inputDevice = inputDevice
        self.__memory = memory
        self.__cpu = cpu
        self.__gpu = gpu


    def set_outputDevice(self, device):
        self.__outputDevice = device

    def set_inputDevice(self, device):
        self.__inputDevice = device

    def set_memory(self, memory):
        self.__memory = memory

    def set_cpu(self, cpu):
        self.__cpu = cpu

    def set_gpu(self, gpu):
        self.__gpu = gpu

    def get_outputDevice(self):
        return self.__outputDevice

    def get_inputDevice(self):
        return self.__inputDevice

    def get_memory(self):
        return self.__memory

    def get_cpu(self):
        return self.__cpu

    def get_gpu(self):
        return self.__gpu


    def clone(self):
        return PersonalComputer(self.__outputDevice, self.__inputDevice, self.__memory, self.__cpu, self.__gpu)


    def toString(self):
        return "PersonalComputer{outputDevice='" + self.__outputDevice + "', inputDevice='" + self.__inputDevice + "', memory='" + self.__memory \
            + "', cpu='" + self.__cpu + "', gpu='" + str(self.__gpu) + "'}"