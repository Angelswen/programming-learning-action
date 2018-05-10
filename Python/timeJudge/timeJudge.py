#程序功能：判断今天是今年的第几天

import time
#获取年、月、日
date = time.localtime()
year=date[0]
month=date[1]
day=date[2]

#平年
day_month=[31,28,31,30,31,30,31,31,30,31,30,31]

#闰年判断
if year%400==0 or (year%4==0 and year%100!=0):
    day_month[1]=29
if month==1:
    print(day)
else:
    print(sum(day_month[:month-1])+day)
