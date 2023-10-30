rom interfaces.PhoneProduct import PhoneProduct

class Iphone(PhoneProduct):
    def show_phone_catalog(self):
        print("1. IPhone 15 42500грн\n"
              "2. IPhone 14 37000грн\n"
              "3. IPhone 14 Plus 42000грн\n"
              "4. IPhone 11 24000грн\n"
              "5. IPhone 13 mini 34000грн\n")
