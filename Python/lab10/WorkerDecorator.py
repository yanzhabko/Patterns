from Worker import Worker

class WorkerDecorator(Worker):
    worker: Worker

    def __init__(self, worker: Worker):
        self.worker = worker

    def doWork(self) -> str:
        return self.worker.doWork()
