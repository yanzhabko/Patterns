from PhoneOrderFactory import PhoneOrderFactory

if __name__ == '__main__':
    phone_factory = PhoneOrderFactory()
    phone_order_list = []
    phone_order_list.append(phone_factory.get_phone_order_type("Samsung"))
    phone_order_list.append(phone_factory.get_phone_order_type("Samsung"))
    phone_order_list.append(phone_factory.get_phone_order_type("Iphone"))
    phone_order_list.append(phone_factory.get_phone_order_type("Iphone"))
    phone_order_list.append(phone_factory.get_phone_order_type("Poco"))
    phone_order_list.append(phone_factory.get_phone_order_type("Poco"))

    for phone_order in phone_order_list:
        phone_order.create_phone_order()

