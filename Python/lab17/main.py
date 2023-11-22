# This is a sample Python script.
from IMediator import IMediator
from Mediator import Mediator
from Consultant import Consultant
from Order import Order
from ConsultantAbstract import ConsultantAbstract
# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    mediator = Mediator()
    consultant_roma = Consultant(mediator, "roma", "Intern")
    consultant_vlad = Consultant(mediator, "vlad", "junior")
    consultant_vasya = Consultant(mediator, "vasya", "middle")
    consultant_petya = Consultant(mediator, "petya", "senior")

    mediator.add_consultant(consultant_roma)
    mediator.add_consultant(consultant_vlad)
    mediator.add_consultant(consultant_vasya)
    mediator.add_consultant(consultant_petya)
    order=Order("repair phone", "repair")
    consultant_roma.send_order(order)
    print()
    consultant_petya.send_order(Order("create pc", "create"))

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
