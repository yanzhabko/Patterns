from Administrator import Administrator
from Receiver import Receiver
from ServiceEmployee import ServiceEmployee
from StandartWorker import StandartWorker
from Worker import Worker


if __name__ == '__main__':
    worker: Worker = Administrator(ServiceEmployee(Receiver(StandartWorker())))
    print(worker.doWork())
    print('PyCharm')

