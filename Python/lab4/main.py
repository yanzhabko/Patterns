from factory.ProductFactory import ProductFactory

if __name__ == '__main__':
    factoryPhone = ProductFactory().create_factory("Phone")

    samsungCalalog = factoryPhone.createPhone("Samsung")
    pixelCatalog = factoryPhone.createPhone("Pixel")
    iphoneCatalog = factoryPhone.createPhone("Iphone")
    print("Samsung")
    samsungCalalog.show_phone_catalog()
    print("Pixel")
    pixelCatalog.show_phone_catalog()
    print("Iphone")
    iphoneCatalog.show_phone_catalog()

    factoryPc = ProductFactory().create_factory("PC")
    gamingCatalog = factoryPc.createPc("Gaming")
    oficeCatalog = factoryPc.createPc("Ofice")
    print("Ігрові комп'ютери")
    gamingCatalog.show_pc_catalog()
    print("Офісні комп'ютери")
    oficeCatalog.show_pc_catalog()

    factoryLaptop = ProductFactory().create_factory("Laptop")
    gamingLaptop = factoryLaptop.createLaptop("Gaming")
    oficeLaptop = factoryLaptop.createLaptop("Ofice")
    print("Ігрові ноутбуки")
    gamingLaptop.show_laptop_catalog()
    print("Офісні ноутбуки")
    oficeLaptop.show_laptop_catalog()
