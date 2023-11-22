from Order import Order
from Version import Version


class ControllSystem:
    def __init__(self, order):
        self.order = order
        self.version = Version()

    def get_order(self):
        return self.order

    def set_order(self, name, type):
        self.order.set_name(name)
        self.order.set_type(type)

    def save_order_to_memento(self):
        self.version.add_version(self.order.copy())

    def restore_version_from_memento(self, version):
        self.order = self.version.get_version(version)
