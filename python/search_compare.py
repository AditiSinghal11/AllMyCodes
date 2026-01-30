# Compare Linear vs Binary Search (array of 10000 random integers)
# Generates the array, asks user for 5 search keys, measures search times, and plots results

import random
import time
import matplotlib.pyplot as plt
from typing import List


def linear_search(arr: List[int], key: int) -> int:
    for i, v in enumerate(arr):
        if v == key:
            return i
    return -1


def binary_search(arr: List[int], key: int) -> int:
    lo, hi = 0, len(arr) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if arr[mid] == key:
            return mid
        elif arr[mid] < key:
            lo = mid + 1
        else:
            hi = mid - 1
    return -1


if __name__ == "__main__":
    random.seed()
    n = 10000
    arr = [random.randint(1, 1000) for _ in range(n)]
    sorted_arr = sorted(arr)

    print("Generated an array of 10000 integers in range [1, 1000].")

    keys = []
    print("Enter 5 search keys (press Enter after each):")
    for i in range(5):
        keys.append(int(input(f"Key {i+1}: ")))

    lin_times = []
    bin_times = []
    lin_found = []
    bin_found = []

    for k in keys:
        st = time.perf_counter_ns()
        idx = linear_search(arr, k)
        ed = time.perf_counter_ns()
        lin_times.append(ed - st)
        lin_found.append(idx)

        st = time.perf_counter_ns()
        idx2 = binary_search(sorted_arr, k)
        ed = time.perf_counter_ns()
        bin_times.append(ed - st)
        bin_found.append(idx2)

    print("Keys:", keys)
    print("Linear times (ns):", lin_times)
    print("Binary times (ns):", bin_times)
    print("Linear found indices:", lin_found)
    print("Binary found indices (in sorted array):", bin_found)

    x = [str(k) for k in keys]
    plt.plot(x, lin_times, marker='o', label='Linear Search', color='orange')
    plt.plot(x, bin_times, marker='o', label='Binary Search', color='green')
    plt.xlabel('Search key')
    plt.ylabel('Time (ns)')
    plt.title('Linear vs Binary Search: 5 sample searches')
    plt.legend()
    plt.grid(True)
    plt.show()