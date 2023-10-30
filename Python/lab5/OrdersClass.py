class Orders:
    def __init__(self, name: str, lastName: str, typeofDevice: str, cpu: str, gpu: str, rom: str, ssd: str, hhd: str,
                power: str, motherboard: str):
        self.name = name
        self.lastName = lastName
        self.typeofDevice = typeofDevice
        self.cpu = cpu
        self.gpu = gpu
        self.rom = rom
        self.ssd = ssd
        self.hhd = hhd
        self.power = power
        self.motherboard = motherboard

    def __str__(self):
        # Повертає рядок з описом замовлення
        return f"Orders{{name='{self.name}', lastName='{self.lastName}', typeOfDevice='{self.typeofDevice}', " \
               f"cpu='{self.cpu}', gpu='{self.gpu}', rom='{self.rom}', ssd='{self.ssd}', " \
               f"hhd='{self.hhd}', power='{self.power}', motherboard='{self.motherboard}'}}"

    @staticmethod
    def builder():
        return OrdersBuilder()

class OrdersBuilder:
    def __init__(self):
        self.lastName = None
        self.motherboard = None
        self.power = None
        self.hhd = None
        self.cpu = None
        self.ssd = None
        self.gpu = None
        self.rom = None
        self.typeofDevice = None
        self.name = None

    def set_name(self, name: str):
        self.name = name
        return self

    def set_lastName(self, lastName: str):
        self.lastName = lastName
        return self

    def set_typeofDevice(self, typeofDevice: str):
        self.typeofDevice = typeofDevice
        return self

    def set_cpu(self, cpu: str):
        self.cpu = cpu
        return self

    def set_gpu(self, gpu: str):
        self.gpu = gpu
        return self

    def set_rom(self, rom: str):
        self.rom = rom
        return self

    def set_ssd(self, ssd: str):
        self.ssd = ssd
        return self

    def set_hhd(self, hhd: str):
        self.hhd = hhd
        return self

    def set_power(self, power: str):
        self.power = power
        return self

    def set_motherboard(self, motherboard: str):
        self.motherboard = motherboard
        return self

    def build(self):
        return Orders(self.name, self.lastName, self.typeofDevice, self.cpu, self.gpu, self.rom, self.ssd, self.hhd,
                      self.power, self.motherboard)
