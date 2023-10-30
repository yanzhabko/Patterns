from factory.ProductFactory import ProductFactory

if __name__ == '__main__':
    product_factory = ProductFactory()

    phone = product_factory.createProduct('Phone')
    laptop = product_factory.createProduct('Laptop')
    personalComp = product_factory.createProduct('PC')

    phone.get_product()
    laptop.get_product()
    personalComp.get_product()
