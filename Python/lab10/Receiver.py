from Worker import Worker
from WorkerDecorator import WorkerDecorator

class Receiver(WorkerDecorator):
    def __init__(self, worker: Worker):
        super().__init__(worker)

    def makeJob(self) -> str:
        return " Create order."

    def doWork(self) -> str:
        return super().doWork() + self.makeJob()
