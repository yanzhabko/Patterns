class Order:
    def __init__(self, name, type):
        self.name = name
        self.type = type

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_type(self):
        return self.type

    def set_type(self, type):
        self.type = type

    def __str__(self):
        return f"Order{{name='{self.name}', type='{self.type}'}}"
