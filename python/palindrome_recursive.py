# Recursive palindrome checker and timing

import time


def is_palindrome(s: str) -> bool:
    if len(s) <= 1:
        return True
    if s[0] != s[-1]:
        return False
    return is_palindrome(s[1:-1])


if __name__ == "__main__":
    s = input("Enter a string to test for palindrome: ")
    # If you want to ignore case and non-alphanumerics, normalize here. For now, use exact comparison.
    st = time.perf_counter_ns()
    res = is_palindrome(s)
    ed = time.perf_counter_ns()
    print(f"Is palindrome: {res}")
    print(f"Time taken: {ed - st} ns")