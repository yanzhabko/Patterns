from PhoneOrder import PhoneOrder

class PhoneOrderFactory:
    def __init__(self):
        self.phone_map = {}

    def get_phone_order_type(self, type_phone_order):
        phone_order = self.phone_map.get(type_phone_order)
        if phone_order is None:
            phone_order = PhoneOrder(type_phone_order)
            print("Creating type of phone order like", phone_order.name)
            self.phone_map[type_phone_order] = phone_order
        return phone_order
