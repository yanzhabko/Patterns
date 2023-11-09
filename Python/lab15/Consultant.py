from ActiveSubscription import ActriveSubscription
from CallToClient import CallToClient
from CreateOrder import CreateOrder
from DeleteOrder import DeleteOrder


class Consultant:
    def __init__(self, call_to_client: CallToClient, create_order: CreateOrder, delete_order: DeleteOrder,
                 activate_subscription: ActriveSubscription):
        self.callToClient = call_to_client
        self.createOrder = create_order
        self.deleteOrder = delete_order
        self.activateSubscription = activate_subscription

    def create_order(self, name):
        self.createOrder.execute(name)

    def delete_order(self, name):
        self.deleteOrder.execute(name)

    def call_to_client(self, phone:str):
        self.callToClient.execute(phone)

    def activate_subscription(self, login):
        self.activateSubscription.execute(login)
