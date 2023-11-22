# This is a sample Python script.
from Order import Order
from ControllSystem import ControllSystem
from Version import Version

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    order = Order("phone", "repair")
    controll_system = ControllSystem(order)

    controll_system.save_order_to_memento()

    controll_system.set_order("pc", "create")
    controll_system.save_order_to_memento()

    controll_system.restore_version_from_memento(1)
    print(controll_system.get_order())
    print()

    controll_system.restore_version_from_memento(2)
    print(controll_system.get_order())

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
