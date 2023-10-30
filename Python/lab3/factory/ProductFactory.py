from interface.product import Product
from product.phone import Phone
from product.laptop import Laptop
from product.personalComputer import PersonalComp


class ProductFactory():
    def createProduct(self, type_of_product: str) -> Product:
        if type_of_product == "Phone":
            return Phone()
        elif type_of_product == "Laptop":
            return Laptop()
        elif type_of_product == "PC":
            return PersonalComp()
        else:
            return None
