from Realisation.Consultant import Consultant
from Realisation.PcOrder import PcOrder
from Realisation.PhoneOrder import PhoneOrder
from Realisation.PcOrderAdapter import PcOrderAdapter

if __name__ == '__main__':
    consultant = Consultant()
    consultant.create_order(PhoneOrder())
    print()
    consultant.create_order(PcOrderAdapter(PcOrder()))
