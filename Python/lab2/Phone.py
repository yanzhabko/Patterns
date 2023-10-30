import copy


class Phone:

    __screen: str = ''
    __camera: str = ''
    __memory: str = ''
    __cpu: str = ''
    __gpu: str = ''

    def __init__(self, screen, camera, memory, cpu, gpu):
        self.__screen = screen
        self.__camera = camera
        self.__memory = memory
        self.__cpu = cpu
        self.__gpu = gpu

    def set_screen(self, screen):
        self.__screen = screen

    def set_camera(self, camera):
        self.__camera = camera

    def set_memory(self, memory):
        self.__memory = memory

    def set_cpu(self, cpu):
        self.__cpu = cpu

    def set_gpu(self, gpu):
        self.__gpu = gpu


    def get_screen(self):
        return self.__screen

    def get_camera(self):
        return self.__camera

    def get_memory(self):
        return self.__memory

    def get_cpu(self):
        return self.__cpu

    def get_gpu(self):
        return self.__gpu


    def clone(self):
        return Phone(self.__screen, self.__camera, self.__memory, self.__cpu, self.__gpu)


    def toString(self):
        return "Phone{screen='" + self.__screen + "', camera='" + self.__camera + "', memory='" + self.__memory \
            + "', cpu='" + self.__cpu + "', gpu='" + str(self.__gpu) + "'}"