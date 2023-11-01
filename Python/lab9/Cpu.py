from Component import Component

class Cpu(Component):

    def __init__(self, name: str):
        self.name = name

    def repair(self):
        print("We repair " + self.name)


