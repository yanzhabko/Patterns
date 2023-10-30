from OrdersClass import Orders

if __name__ == '__main__':
    orders: Orders = Orders.builder().set_name("Roma").set_lastName("Pavliuk").set_typeofDevice("PC").set_cpu("I9-7300") \
        .set_gpu("RX 550").set_hhd("1T").set_power("600W").set_motherboard("Asus").set_rom("8Gb").build()
    print(orders)

    orders1 = Orders.builder().set_name("Roma").set_lastName("Pavliuk").set_cpu("I9-11000").set_gpu("RX 4050").set_ssd("1T").\
        set_power("600W").set_motherboard("Asus").set_rom("8Gb").build()
    print(orders1)
