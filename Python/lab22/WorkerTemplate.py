from abc import ABC, abstractmethod


class WorkerTemplate(ABC):
    def start_variable(self):
        print("Worker start variable")

    def end_variable(self):
        print("Worker finish variable")

    @abstractmethod
    def do_work(self):
        pass

    @abstractmethod
    def take_over(self):
        pass

    @abstractmethod
    def continue_work(self):
        pass

    def show_work_schedule(self):
        self.start_variable()
        self.do_work()
        self.take_over()
        self.continue_work()
        self.end_variable()
