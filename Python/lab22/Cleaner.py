from WorkerTemplate import WorkerTemplate


class Cleaner(WorkerTemplate):
    def do_work(self):
        print("I cleaned the whole building")

    def take_over(self):
        pass

    def continue_work(self):
        pass
