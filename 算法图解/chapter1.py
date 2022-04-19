# _*_ coding: utf-8 _*_
# @Time : 2022/4/19 16:43
# @Author : kirovj
# @desc :

# Exercise 2.2
class RestaurantArray:
    def __init__(self):
        self.dishes = []

    def order(self, name: str):
        self.dishes.append(name)

    def make(self):
        return self.dishes.pop(0)


class Dish:
    def __init__(self, name, next_dish=None):
        self.name = name
        self.next = next_dish

    def set_next(self, next_dish):
        self.next = next_dish

    def next_val(self):
        return self.next


class RestaurantLinkedList:

    def __init__(self):
        self.dish = None

    def order(self, dish: Dish):
        if self.dish is None:
            self.dish = dish
        else:
            self.last().set_next(dish)

    def last(self):
        dish = self.dish
        while dish.next_val() is not None:
            dish = dish.next
        return dish

    def make(self):
        dish = self.dish
        self.dish = self.dish.next_val()
        return dish.name


def test_restaurant_array():
    restaurant = RestaurantArray()
    restaurant.order("beef")
    restaurant.order("milk")
    restaurant.order("potato")
    assert restaurant.make() == "beef"
    assert restaurant.make() == "milk"
    assert restaurant.make() == "potato"


def test_restaurant_linked_list():
    restaurant = RestaurantLinkedList()
    restaurant.order(Dish("beef"))
    restaurant.order(Dish("milk"))
    restaurant.order(Dish("potato"))
    assert restaurant.make() == "beef"
    assert restaurant.make() == "milk"
    assert restaurant.make() == "potato"
