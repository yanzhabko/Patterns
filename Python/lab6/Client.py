from ConsultantPool import ConsultantPool

class Client:

    def __init__(self, name: str, lastName: str):
        self.name = name
        self.lastName = lastName
    def getConsultant(self, consultantPool: ConsultantPool):
        if self.consultant is None:
            self.consultant = consultantPool.getConsultant()
            if self.consultant is None:
                print("У мене немає консультанта")
            else:
                print("У мене є консультант")
        else:
            print("Я не хочу другого консультанта")

    def returnConsultant(self, consultantPool: ConsultantPool):
        if self.consultant is None:
            print("У мене немає консультанта, я не можу повернути")
        else:
            consultantPool.returnConsultant(self.consultant)
            self.consultant = None
            print("Я повертаю консультанта")
