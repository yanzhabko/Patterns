class Version:
    def __init__(self):
        self.order_list = []

    def add_version(self, order):
        self.order_list.append(order)

    def get_order_list(self):
        return self.order_list

    def get_version(self, version):
        return self.order_list[version - 1] if 0 < version <= len(self.order_list) else None
