# import OrdersClass
#
# class OrdersBuilder:
#     def __init__(self):
#         self.lastName = None
#         self.motherboard = None
#         self.power = None
#         self.hhd = None
#         self.cpu = None
#         self.ssd = None
#         self.gpu = None
#         self.rom = None
#         self.typeofDevice = None
#         self.name = None
#
#     def __int__(self, name: str, lastName: str, typeofDevice: str, cpu: str, gpu: str, rom: str, ssd: str, hhd: str,
#                 power: str,
#                 motherboard: str):
#         self.name = name
#         self.lastName = lastName
#         self.typeofDevice = typeofDevice
#         self.cpu = cpu
#         self.gpu = gpu
#         self.rom = rom
#         self.ssd = ssd
#         self.hhd = hhd
#         self.power = power
#         self.motherboard = motherboard
#
#     def name(self, name: str):
#         self.name = name
#         return self
#
#     def lastName(self, lastName: str):
#         self.lastName = lastName
#         return self
#
#     def typeofDevice(self, typeofDevice: str):
#         self.typeofDevice = typeofDevice
#         return self
#
#     def cpu(self, cpu: str):
#         self.cpu = cpu
#         return self
#
#     def gpu(self, gpu: str):
#         self.gpu = gpu
#         return self
#
#     def rom(self, rom: str):
#         self.rom = rom
#         return self
#
#     def ssd(self, ssd: str):
#         self.ssd = ssd
#         return self
#
#     def hhd(self, hhd: str):
#         self.hhd = hhd
#         return self
#
#     def power(self, power: str):
#         self.power = power
#         return self
#
#     def motherboard(self, motherboard: str):
#         self.motherboard = motherboard
#         return self
#
#     def build(self):
#         return OrdersClass.Orders(self.name, self.lastName, self.typeofDevice, self.cpu, self.gpu, self.rom, self.ssd, self.hhd,
#                                   self.power, self.motherboard)
