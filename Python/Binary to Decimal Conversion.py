# Program to convert a binary number to decimal number.
sum1 = 0
sum2 = 0
def integer_binary_to_decimal():
    global sum1
    integerlist = []
    integer_num = int(num)

    string_num = str(integer_num)

    for i in range(len(string_num)):
        power = len(string_num)

        digit = int(string_num[i])
        integerlist.append(digit)

        y = 2**(power-i-1)
        multiply = digit*y
        sum1 += multiply


def fractional_binary_to_decimal():
    global sum2
    string_num = str(num)
    fractionallist = []
    fractional_list = []
    length = len(string_num)
    for i in range(length):
        fractionallist.append(string_num[i])

    for i in range(length):
        if string_num[i] == ".":
            indexofdot = i
    f = indexofdot + 1

    for j in range(f,length):
        stringdigit = string_num[j]
        digit = int(stringdigit)
        fractional_list.append(digit)
        y = 2**(4-j)
        multiply = digit*y
        sum2 += multiply

def binary_to_decimal():
    print(f"(Binary) {num} = ",end="")

    integer_binary_to_decimal()
    fractional_binary_to_decimal()

    print(sum1+sum2,end="")
    print(" (Decimal)")

num = float(input("Enter a number : "))
binary_to_decimal()