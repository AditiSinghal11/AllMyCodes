# Recursive string reversal and timing

import time


def reverse_string(s: str) -> str:
    if s == "":
        return ""
    return reverse_string(s[1:]) + s[0]


if __name__ == "__main__":
    s = input("Enter a string to reverse: ")
    st = time.perf_counter_ns()
    rev = reverse_string(s)
    ed = time.perf_counter_ns()
    print(f"Reversed: {rev}")
    print(f"Time taken: {ed - st} ns")