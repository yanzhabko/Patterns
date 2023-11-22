from Job import Job


class Order(Job):
    def __init__(self, name, type):
        self.name = name
        self.type = type

    def do_job(self, worker):
        worker.create_order()
        print(f"Order: {self.name}, type: {self.type} created")
