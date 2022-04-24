# _*_ coding: utf-8 _*_
# @Time : 2022/4/20 11:13
# @Author : kirovj
# @desc :


# Exercise 4.1
def sum_recursion(arr: []):
    if not arr:
        return 0
    return arr[0] + sum_recursion(arr[1:])


def test_sum_recursion():
    assert 15 == sum_recursion([1, 2, 3, 4, 5])


# Exercise 4.2
def count_recursion(arr: []):
    if not arr:
        return 0
    return 1 + count_recursion(arr[1:])


def test_count_recursion():
    assert 5 == count_recursion([1, 2, 3, 4, 5])


# Exercise 4.3
def max_recursion(arr: []):
    if len(arr) == 0:
        return None
    if len(arr) == 1:
        return arr[0]
    else:
        sub = max_recursion(arr[1:])
        return arr[0] if arr[0] > sub else sub


def test_max_recursion():
    assert 5 == max_recursion([3, 1, 5, 4, 0])

