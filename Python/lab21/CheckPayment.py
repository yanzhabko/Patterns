from PaymentMethod import PaymentMethod


class CheckPayment(PaymentMethod):
    def do_payment(self):
        print("Transaction successful with CheckPayment")
