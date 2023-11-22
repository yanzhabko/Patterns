# This is a sample Python script.
from Consultant import Consultant
from Administrator import Administrator
from Cleaner import Cleaner
# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    consultant = Consultant()
    cleaner = Cleaner()
    administrator = Administrator()

    administrator.show_work_schedule()
    print()
    consultant.show_work_schedule()
    print()
    cleaner.show_work_schedule()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
