from Observer import Observer


class Consultant(Observer):
    consultants = []

    def __init__(self, full_name, rang, is_active):
        self.full_name = full_name
        self.rang = rang
        self.is_active = is_active
        Consultant.consultants.append(self)

    def remove(self):
        Consultant.consultants.remove(self)
        self.notify(self, "remove")

    def add(self, consultant):
        self.notify(consultant, "add")

    def change_status(self):
        if self.is_active:
            self.is_active = False
            self.notify(self, "false")
        else:
            self.is_active = True
            self.notify(self, "true")

    def notify(self, consultant, command):
        for c in Consultant.consultants:
            if c != consultant:
                if command == "remove":
                    print(f"Consultant: {c.full_name} get that consultant {consultant.full_name} is dismissed")
                elif command == "add":
                    print(f"Consultant: {c.full_name} get that consultant {consultant.full_name} is hiring")
                elif command == "true":
                    print(f"Consultant: {c.full_name} get that consultant {consultant.full_name} took over the shift")
                elif command == "false":
                    print(f"Consultant: {c.full_name} get that consultant {consultant.full_name} finished the shift")
