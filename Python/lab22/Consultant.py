from WorkerTemplate import WorkerTemplate


class Consultant(WorkerTemplate):
    def do_work(self):
        print("I help clients")

    def take_over(self):
        print("I have a break from 13:00 to 14:00")

    def continue_work(self):
        print("I continue helping clients")