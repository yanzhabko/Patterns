from IMediator import IMediator


class Mediator(IMediator):
    def __init__(self):
        self.consultant_list = []

    def add_consultant(self, consultant):
        self.consultant_list.append(consultant)

    def send_order(self, order, consultant):
        for c in self.consultant_list:
            if c != consultant:
                c.get_order(order)
