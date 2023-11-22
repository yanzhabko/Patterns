from Advice import Advise
from Create import Create
from Repair import Repair
from Rest import Rest


class Consultant:
    def __init__(self):
        self.activity = None

    def set_activity(self, activity):
        self.activity = activity

    def change_activity(self):
        if isinstance(self.activity, Advise):
            self.activity = Create()
        elif isinstance(self.activity, Create):
            self.activity = Repair()
        elif isinstance(self.activity, Repair):
            self.activity = Rest()
        elif isinstance(self.activity, Rest):
            self.activity = Advise()

    def do_work(self):
        self.activity.do_activity()