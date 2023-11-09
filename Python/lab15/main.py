from ActiveSubscription import ActriveSubscription
from CallToClient import CallToClient
from CreateOrder import CreateOrder
from DeleteOrder import DeleteOrder
from Consultant import Consultant
from Service import Service

if __name__ == '__main__':
    service = Service()
    consultant = Consultant(
        CallToClient(service),
        CreateOrder(service),
        DeleteOrder(service),
        ActriveSubscription(service)
    )
    consultant.call_to_client("0501726116")
    consultant.create_order("Reapair Iphone 15")
    consultant.delete_order("Create PC")
    consultant.activate_subscription("prozaik")