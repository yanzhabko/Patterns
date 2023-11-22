# This is a sample Python script.
from Consultant import Consultant

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.


# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    roma = Consultant("Roma Pavliuk", "intern", False)
    vlad = Consultant("Vlad Kiriliuk", "Middle", False)
    pasha = Consultant("Pasha Silimonka", "Senior", False)
    masha = Consultant("Masha Luziv", "GrantMaster", False)
    masha.add(Consultant("Katya", "junior", False))
    print()
    roma.change_status()
    print()
    vlad.remove()
    print()
    roma.change_status()
    print()
    pasha.remove()

# See PyCharm help at https://www.jetbrains.com/help/pycharm/
