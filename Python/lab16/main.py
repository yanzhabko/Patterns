from OrderCollection import OrderCollection
from Order import Order

if __name__ == '__main__':
    collection = OrderCollection()
    collection.add_order(Order("phoner", "create"))
    collection.add_order(Order("phoner", "repair"))
    collection.add_order(Order("phoner", "sale"))

    for order in collection:
        print(order)

