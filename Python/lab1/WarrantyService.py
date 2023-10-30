class WarrantyService(object):
    _instance = None

    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(WarrantyService, cls).__new__(cls)

            cls._instance.warranty_info = {}

        return cls._instance

    def register_warranty(self, product_id, warranty_period):
        self.warranty_info[product_id] = warranty_period

    def check_warranty(self, product_id):
        if product_id in self.warranty_info:
            return f"Гарантія на товар {product_id} дійсна до {self.warranty_info[product_id]}"
        else:
            return f"Гарантія на товар {product_id} не знайдена"
