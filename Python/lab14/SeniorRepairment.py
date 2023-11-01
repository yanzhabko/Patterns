from Notification import Notification

class SeniorRepairman(Notification):
    def __init__(self, priority):
        super().__init__(priority)

    def print_message(self, message):
        print(f"It`s very hard, senior try repair: {message}")