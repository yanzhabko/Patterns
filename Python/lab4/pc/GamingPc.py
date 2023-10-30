from interfaces.PcProduct import PcProduct

class GamingPc(PcProduct):
    def show_pc_catalog(self):
        print("1. Збірка Nexus 22500грн\n"
              "2. Збірка Cyclope Limited 30000грн\n"
              "3. Збірка Optimum 22000грн\n"
              "4. Збірка Mega 42500грн\n"
              "5. Збірка Phoenix 17000грн\n")
