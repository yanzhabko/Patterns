from Consultant import Consultant

class ConsultantPool:
    free = [Consultant("Roma", "Ppavliuk", 20), Consultant("Okun", "Karas", 20), Consultant("Karas", "Karas", 20)]
    used = []
    def getConsultant(self) -> Consultant:
        if not self.free:
            return None
        else:
            consultant: Consultant = self.free.pop(0)
            self.used.append(consultant)
            return consultant
    def returnConsultant(self, consultant: Consultant):
        self.used.remove(consultant)
        self.free.append(consultant)