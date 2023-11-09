from Command import Command


class DeleteOrder(Command):
    def __init__(self, service):
        self.service = service

    def execute(self, name):
        self.service.delete_order(name)
