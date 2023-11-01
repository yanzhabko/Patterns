from Worker import Worker
from WorkerDecorator import WorkerDecorator

class ServiceEmployee(WorkerDecorator):
    def __init__(self, worker: Worker):
        super().__init__(worker)

    def makeJob(self) -> str:
        return " Repair devices."

    def doWork(self) -> str:
        return super().doWork() + self.makeJob()
