def insertion_sort(arr):
    for i in range(1, len(arr)):
        key = arr[i]
        j = i - 1

        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1

        arr[j + 1] = key

# User input for the list of numbers
input_list = input("Enter a list of numbers (comma-separated): ")
arr = [int(x) for x in input_list.split(",")]

insertion_sort(arr)

print("Sorted array is:", arr)
