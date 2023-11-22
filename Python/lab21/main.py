# This is a sample Python script.
from Order import Order
from CardPayment import CardPayment
from CashPayment import CashPayment
from CheckPayment import CheckPayment

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    order = Order("Create pc", "create")
    order.set_payment_method(CardPayment())
    order.set_payment_method(CheckPayment())
    order.set_payment_method(CashPayment())
    order.do_payment()
    order.set_payment_method(CheckPayment())
    order.do_payment()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
