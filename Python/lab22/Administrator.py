from WorkerTemplate import WorkerTemplate


class Administrator(WorkerTemplate):
    def do_work(self):
        print("I administer in an organization")

    def take_over(self):
        print("I have a break from 13:00 to 14:00")

    def continue_work(self):
        print("I continue administering in an organization")
