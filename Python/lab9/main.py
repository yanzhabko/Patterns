from Pc import Pc
from Cpu import Cpu
from Gpu import Gpu
from Motherboard import Motherboard
from Power import Power

if __name__ == '__main__':
    pc: Pc = Pc()
    componentPc: Pc = Pc()
    pc.addComponent(Cpu("inte i9"))
    pc.addComponent(Power("fujitsu 600w"))
    pc.addComponent(Gpu("rx 4090 24gb"))
    pc.addComponent(Motherboard("Asus"))
    pc.repair()
    componentPc.addComponent(pc)
    componentPc.repair()
    print('PyCharm')

