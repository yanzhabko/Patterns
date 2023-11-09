from Command import Command


class ActriveSubscription(Command):
    def __init__(self, service):
        self.service = service

    def execute(self, login):
        self.service.activate_subscription(login)