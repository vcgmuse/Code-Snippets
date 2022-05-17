# This is a sample Python script.

# Press Shift+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.

totalCount = 0


def get_factor(int_value):
    factor = 5
    while factor == 4 or int_value % factor != 0:
        factor -= 1
    return factor


def return_list_of_interactions(total_number_of_locker):
    answer = []
    for n in range(1, total_number_of_locker + 1):
        factor = get_factor(n)
        answer.append(len(get_factor_list(n, factor)))
        # TODO: Complete with getFactorList
    return answer


def get_factor_list(value, factor):
    temp_list = []
    counter = 1
    if factor == 1:
        counter += 1
        if value not in temp_list:
            temp_list.append(value)
        if factor not in temp_list:
            temp_list.append(factor)
        temp_list.sort()
        return temp_list
    for n in range(1, int(value / 2) + 1):
        counter += 1
        if n % factor == 0:
            if factor not in temp_list:
                temp_list.append(factor)
            if int(n / 2) not in temp_list:
                temp_list.append(int(n / 2))
    if 1 not in temp_list:
        temp_list.append(1)
    if value not in temp_list:
        temp_list.append(value)
    temp_list.sort()
    return temp_list


print(return_list_of_interactions(25))
