from Product.Laptop import Laptop
from Product.Phone import Phone
from Product.Pc import PC
from Stage.FirstDtage import FirstStage
from Stage.SecondStage import SecondStage
from Stage.ThirsdStage import ThirdStage

if __name__ == '__main__':
    print("Laptop")
    laptop = Laptop(FirstStage())
    laptop.get_info_about_stage()
    laptop.repair_stages = SecondStage()
    laptop.get_info_about_stage()
    laptop.repair_stages = ThirdStage()



    print("PC")
    pc = PC(FirstStage())
    pc.get_info_about_stage()
    pc.repair_stages = SecondStage()
    pc.get_info_about_stage()
    pc.repair_stages = ThirdStage()
    pc.get_info_about_stage()

    print("Phone")
    phone = Phone(FirstStage())
    phone.get_info_about_stage()
    phone.repair_stages = SecondStage()
    phone.get_info_about_stage()
    phone.repair_stages = ThirdStage()
    phone.get_info_about_stage()
