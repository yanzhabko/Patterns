from Job import Job


class Consultation(Job):
    def do_job(self, worker):
        worker.do_consultation()
