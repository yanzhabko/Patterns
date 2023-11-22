from PaymentMethod import PaymentMethod


class CardPayment(PaymentMethod):
    def do_payment(self):
        print("Transaction successful with CardPayment")