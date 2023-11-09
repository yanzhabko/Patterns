from Order import Order
from collections.abc import Iterable
from OrderIterator import OrderIterator
from typing import List

class OrderCollection(Iterable):
    def __init__(self, collection: List[Order] = []) -> None:
        self._collection = collection

    def __iter__(self) -> OrderIterator:

        return OrderIterator(self._collection)

    def get_reverse_iterator(self) -> OrderIterator:
        return OrderIterator(self._collection, True)

    def add_order(self, item: Order):
        self._collection.append(item)