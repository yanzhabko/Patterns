from Command import Command
from Service import Service

class CallToClient(Command):
    def __init__(self, service:Service):
        self.service = service

    def execute(self, phone):
        self.service.call_to_client(phone)
