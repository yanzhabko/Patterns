class Service:
    def create_order(self, name):
        print(f"Order: {name}, create")

    def delete_order(self, name):
        print(f"Order: {name}, delete")

    def activate_subscription(self, login):
        print(f"Subscription for user: {login}, activated")

    def call_to_client(self, phone):
        print(f"Calling to: {phone}")
