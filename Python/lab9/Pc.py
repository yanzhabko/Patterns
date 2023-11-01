from Component import Component

class Pc(Component):
    def __init__(self):
        self.components = []

    def addComponent(self, component: Component):
        self.components.append(component)

    def removeComponent(self, component: Component):
        self.components.remove(component)

    def repair(self):
        print("\nWe repair")
        for component in self.components:
            component.repair()
