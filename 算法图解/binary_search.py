# _*_ coding: utf-8 _*_
# @Time : 2022/4/18 20:17
# @Author : kirovj
# @desc :


def binary_search(array, item):
    """
    binary search
    :param array: list
    :param item: to find
    :return: index
    """
    left = 0
    right = len(array)

    while left <= right:
        mid = (left + right) / 2
        guess = array[mid]
        if item == guess:
            return mid
        elif item > guess:
            left = mid + 1
        else:
            right = mid - 1
    return None

