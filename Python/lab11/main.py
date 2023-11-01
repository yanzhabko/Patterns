from Order import Order
from OrderService import OrderService

if __name__ == '__main__':
    orderService = OrderService(Order("pc", "create"))
    orderService.make_order()

