from Component import Component

class Power(Component):
    def __init__(self, name: str):
        self.name = name

    def repair(self):
        print("We repair " + self.name)
