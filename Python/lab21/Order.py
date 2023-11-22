from CardPayment import CardPayment
from CashPayment import CashPayment
from CheckPayment import CheckPayment


class Order:
    def __init__(self, name, type):
        self.name = name
        self.type = type
        self.payment_method = None
        self.is_closed = False

    def set_payment_method(self, payment_method):
        if not self.is_closed:
            if isinstance(payment_method, CardPayment):
                print("Type of payment was changed to CardPayment")
            elif isinstance(payment_method, CashPayment):
                print("Type of payment was changed to CashPayment")
            elif isinstance(payment_method, CheckPayment):
                print("Type of payment was changed to CheckPayment")

            self.payment_method = payment_method
        else:
            print("The order is paid")

    def do_payment(self):
        if not self.is_closed:
            self.payment_method.do_payment()
            self.is_closed = True
        else:
            print(f"The order: {self.name} type: {self.type} is paid")
