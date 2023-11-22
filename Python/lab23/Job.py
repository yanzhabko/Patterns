from abc import ABC, abstractmethod


class Job(ABC):
    @abstractmethod
    def do_job(self, worker):
        pass
