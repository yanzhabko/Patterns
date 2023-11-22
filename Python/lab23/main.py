# This is a sample Python script.
from Consultation import Consultation
from Worker import Worker
from Order import Order

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    consultation = Consultation()
    order = Order("Iphone", "repair")
    worker = Worker()
    consultation.do_job(worker)
    print()
    order.do_job(worker)

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
