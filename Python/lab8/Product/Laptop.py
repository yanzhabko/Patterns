from Interface.Product import Product

class Laptop(Product):

    def __init__(self, repair_stages):
        super().__init__(repair_stages)

    def get_info_about_stage(self):
        print("The laptop's")
        self.repair_stages.do_stage()

