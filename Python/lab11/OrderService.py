from Order import Order

class OrderService:
    def __init__(self, order: Order):
        self.order = order
        self.free = False

    def make_order(self):
        with open('orders.txt', 'r') as file:
            text = file.read()

        self.free = len(text) > 5

        if self.free:
            self.order.create_order()
            print("Your order has been created.")
        else:
            print("Oops, something went wrong.")
