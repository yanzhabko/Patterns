from Command import Command


class CreateOrder(Command):
    def __init__(self, service):
        self.service = service

    def execute(self, name):
        self.service.create_order(name)