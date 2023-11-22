from ConsultantAbstract import ConsultantAbstract
from Order import Order


class Consultant(ConsultantAbstract):
    def __init__(self, mediator, name, role):
        super().__init__(mediator, name, role)

    def send_order(self, order: Order):
        print(f"Consultant: {self.name}, role: {self.role}, send order: {order}")
        self.mediator.send_order(order, self)

    def get_order(self, order: Order):
        print(f"Consultant: {self.name}, role: {self.role}, get order: {order}")
