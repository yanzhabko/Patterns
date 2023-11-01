from Notification import Notification

class MiddleRepairman(Notification):
    def __init__(self, priority):
        super().__init__(priority)

    def print_message(self, message):
        print(f"I take it apart and look at some details: {message}")