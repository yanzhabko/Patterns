from Notification import Notification

class JuniorRepairman(Notification):
    def __init__(self, priority):
        super().__init__(priority)

    def print_message(self, message):
        print(f"I scan device and something simple to repair it: {message}")
