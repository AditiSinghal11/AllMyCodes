# Sum of first N natural numbers: Iterative vs Recursive
# Measures execution time for user-provided N values and plots the results

import time
import matplotlib.pyplot as plt


def iterative_sum(n: int) -> int:
    total = 0
    for i in range(1, n + 1):
        total += i
    return total


def recursive_sum(n: int) -> int:
    if n <= 1:
        return n
    return n + recursive_sum(n - 1)


if __name__ == "__main__":
    ns = []
    it_times = []
    rec_times = []

    t = int(input("Enter number of different N values to test: "))
    print("Enter the N values (reasonable sizes for recursion, e.g., <= 1000):")
    for _ in range(t):
        n = int(input())
        ns.append(n)

        st = time.perf_counter_ns()
        iterative_sum(n)
        ed = time.perf_counter_ns()
        it_times.append(ed - st)

        st = time.perf_counter_ns()
        recursive_sum(n)
        ed = time.perf_counter_ns()
        rec_times.append(ed - st)

    print("N values:", ns)
    print("Iterative times (ns):", it_times)
    print("Recursive times (ns):", rec_times)

    plt.plot(ns, it_times, marker='o', label='Iterative', color='red')
    plt.plot(ns, rec_times, marker='o', label='Recursive', color='blue')
    plt.xlabel('N')
    plt.ylabel('Time (ns)')
    plt.title('Iterative vs Recursive: Sum of first N natural numbers')
    plt.legend()
    plt.grid(True)
    plt.show()