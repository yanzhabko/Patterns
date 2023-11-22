from PaymentMethod import PaymentMethod


class CashPayment(PaymentMethod):
    def do_payment(self):
        print("Transaction successful with CashPayment")