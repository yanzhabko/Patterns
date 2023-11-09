class Order:
    def __init__(self, customer, action):
        self.customer = customer
        self.action = action

    def __str__(self):
        return f"Customer: {self.customer}, Action: {self.action}"