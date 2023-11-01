from Worker import Worker
from WorkerDecorator import WorkerDecorator

class Administrator(WorkerDecorator):
    def __init__(self, worker: Worker):
        super().__init__(worker)

    def makeJob(self) -> str:
        return " Take interviews and keep track of everything"

    def doWork(self) -> str:
        return super().doWork() + self.makeJob()
