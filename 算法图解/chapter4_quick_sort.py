# _*_ coding: utf-8 _*_
# @Time : 2022/4/20 11:13
# @Author : kirovj
# @desc :

def fact(x):
    if x == 1:
        return x
    return x * fact(x - 1)
