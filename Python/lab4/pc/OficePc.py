from interfaces.PcProduct import PcProduct

class OficePc(PcProduct):
    def show_pc_catalog(self):
        print("1. Комп'ютер Cobra Optimal 9000грн\n"
              "2. Комп'ютер HP Pavilion 550-113nl 12000грн\n"
              "3. Комп'ютер HP 290 G1 MT 10000грн\n"
              "4. Комп'ютер Lenovo ThinkCentre M710s SFF 10000грн\n"
              "5. Комп'ютер Lenovo ThinkCentre M720s SFF 15000грн\n")
