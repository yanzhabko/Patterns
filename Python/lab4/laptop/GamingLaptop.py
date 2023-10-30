from interfaces.LaptopProduct import LaptopProduct

class GamingLaptop(LaptopProduct):
    def show_laptop_catalog(self):
        print("1. Acer Aspire 7 32000грн\n"
              "2. Lenovo IdeaPad Slim 5 27000грн\n"
              "3. ASUS ROG Strix G16 58000грн\n"
              "4. GIGABYTE G5 MF 3900грн\n"
              "5. Lenovo IdeaPad Gaming 3 12000грн\n")
