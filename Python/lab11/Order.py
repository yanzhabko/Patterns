class Order:
    def __init__(self, name_order, type_of_order):
        self.name_order = name_order
        self.type_of_order = type_of_order

    def create_order(self):
        with open('orders.txt', 'a') as file:
            file.write(f'{self.name_order},{self.type_of_order}\n')