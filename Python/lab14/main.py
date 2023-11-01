from JuniorRepairman import JuniorRepairman
from MiddleRepairnman import MiddleRepairman
from SeniorRepairment import SeniorRepairman
from Priority import Priority

if __name__ == '__main__':
    junior_notify = JuniorRepairman(Priority.STANDART)
    middle_notify = MiddleRepairman(Priority.MIDDLE)
    senior_notify = SeniorRepairman(Priority.HARD)

    junior_notify.set_next(middle_notify)
    middle_notify.set_next(senior_notify)

    junior_notify.give_to_next_repairman("Oops something went wrong", Priority.STANDART)
    print()

    junior_notify.give_to_next_repairman("It's not easy", Priority.MIDDLE)
    print()

    junior_notify.give_to_next_repairman("Das ist kaputt", Priority.HARD)

