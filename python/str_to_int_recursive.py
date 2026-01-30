# Recursive conversion of a string of digits into the integer it represents
# Example: '13531' -> 13531
# Measures execution time for the conversion

import time


def str_to_int(s: str) -> int:
    """Converts string digits to int recursively. Assumes s is non-empty and contains only digits."""
    if s == "":
        return 0
    if len(s) == 1:
        return ord(s[0]) - ord('0')
    # value = first_digit * 10^(len-1) + convert(rest)
    return (ord(s[0]) - ord('0')) * (10 ** (len(s) - 1)) + str_to_int(s[1:])


if __name__ == "__main__":
    s = input("Enter a string of digits: ").strip()
    if not s.isdigit():
        print("Input must contain only digits.")
    else:
        st = time.perf_counter_ns()
        value = str_to_int(s)
        ed = time.perf_counter_ns()
        print(f"Converted value: {value}")
        print(f"Time taken: {ed - st} ns")