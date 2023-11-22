from IWorker import IWorker


class Worker(IWorker):
    def do_consultation(self):
        print("Worker consults clients")

    def create_order(self):
        print("Worker creates order")
