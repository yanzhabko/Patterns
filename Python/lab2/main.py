from Laptop import Laptop
from Phone import Phone
from PersonalComputer import PersonalComputer

def print_hi(name):
    print(f'Hi, {name}')


if __name__ == '__main__':

    laptop = Laptop("24dym", "USB, HDMI", "2Tb SSD", "i7-7300", "3060TI")
    phone = Phone("6dym", "48Mpix", "256Gb", "SnapDragon", None)
    personaloComputer = PersonalComputer("Screen, Headphones",
                                         "Mouse, Keyboard, Microphonr", "500Gb SSD, 1TB HHd",
                                         "i3-7300", "RX 550")


    copyLaptop = laptop.clone()
    copyPhone = phone.clone()
    copyPersonalComputer = personaloComputer.clone()


    print("початкові елементи")
    print(laptop.toString())
    print(phone.toString())
    print(personaloComputer.toString())


    copyPhone.set_camera("64Mpix")
    copyPhone.set_screen("5dym")
    copyPhone.set_memory("64Gb")
    copyLaptop.set_gpu("2070Ti")
    copyLaptop.set_cpu("I5-7200")
    copyLaptop.set_screen("22Dym")
    copyPersonalComputer.set_gpu("2060Ti")
    copyPersonalComputer.set_cpu("I9-7200")
    copyPersonalComputer.set_inputDevice("Mouse, Keyboard")


