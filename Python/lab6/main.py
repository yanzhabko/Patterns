from ConsultantPool import ConsultantPool
from Client import Client

if __name__ == '__main__':
    client1: Client = Client("Name1", "LastName1")
    client2: Client = Client("Name2", "LastName2")
    client3: Client = Client("Name3", "LastName3")
    client4: Client = Client("Name4", "LastName4")

    consultantPool: ConsultantPool = ConsultantPool()

    client1.getConsultant(consultantPool)
    client1.getConsultant(consultantPool)

    print()

    client2.getConsultant(consultantPool)
    client3.getConsultant(consultantPool)
    client4.getConsultant(consultantPool)

    print()

    client1.returnConsultant(consultantPool)
    client1.returnConsultant(consultantPool)

    print()

    client4.getConsultant(consultantPool)
