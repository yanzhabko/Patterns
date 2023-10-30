from Interface.Product import Product

class Phone(Product):

    def __init__(self, repair_stages):
        super().__init__(repair_stages)
    def get_info_about_stage(self):
        print("The phone's")
        self.repair_stages.do_stage()

